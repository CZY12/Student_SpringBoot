package com.czy.controller;

import com.czy.commons.ClassInfo;
import com.czy.entity.Class;
import com.czy.service.IClaService;
import com.czy.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName ClaController
 * @Description TODO
 * @Author czy61
 * @Date 2019/9/25 19:54
 * @Version 1.0
 */
@Controller
@RequestMapping("/class")
public class ClaController {

    @Autowired
    private IClaService iClaService;

    @RequestMapping("/list")
    public String list(Model model){
        List<ClassInfo> classList = iClaService.getClassInfo();
        model.addAttribute("classes",classList);
        return "classList";
    }
}
