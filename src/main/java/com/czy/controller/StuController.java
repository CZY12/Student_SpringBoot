package com.czy.controller;

import com.czy.entity.Class;
import com.czy.entity.Student;
import com.czy.service.IClaService;
import com.czy.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName StuController
 * @Description TODO
 * @Author czy61
 * @Date 2019/9/25 19:17
 * @Version 1.0
 */
@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private IStuService iStuService;
    @Autowired
    private IClaService iClaService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Student> list = iStuService.list();
        List<Class> classList = iClaService.list();
        model.addAttribute("students",list);
        model.addAttribute("classes",classList);
        return "studentInfo";
    }

    @RequestMapping("/delete/{id}")
    public String list(@PathVariable Integer id){
        iStuService.removeById(id);
        return "redirect:/stu/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        List<Class> classList = iClaService.list();
        model.addAttribute("classes",classList);
        return "addStu";
    }
    @RequestMapping("/add")
    public String add(Student student){
        iStuService.save(student);
        return "redirect:/stu/list";
    }

    @RequestMapping("/toUpdate/{id}")
    public String tuUpdate(@PathVariable Integer id,Model model){
        Student student = iStuService.getById(id);
        List<Class> classList = iClaService.list();
        model.addAttribute("classes",classList);
        model.addAttribute("stu",student);
        return "updateStu";
    }

    @RequestMapping("/update")
    public String update(Student student){
        iStuService.updateById(student);
        return "redirect:/stu/list";
    }
}
