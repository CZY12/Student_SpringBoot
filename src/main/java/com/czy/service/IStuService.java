package com.czy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czy.entity.Student;

public interface IStuService extends IService<Student> {
    void add(Student student);
}
