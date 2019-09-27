package com.czy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czy.entity.Student;

import java.util.List;

public interface StuMapper extends BaseMapper<Student> {
    void add(Student student);

    int selectByClassId(Integer id);
}
