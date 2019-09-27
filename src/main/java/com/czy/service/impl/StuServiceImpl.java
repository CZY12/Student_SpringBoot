package com.czy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czy.dao.StuMapper;
import com.czy.entity.Student;
import com.czy.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName StuServiceImpl
 * @Description TODO
 * @Author czy61
 * @Date 2019/9/25 19:34
 * @Version 1.0
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Student> implements IStuService {

    @Autowired
    private StuMapper stuMapper;

    @Override
    public void add(Student student) {
        stuMapper.add(student);
    }
}
