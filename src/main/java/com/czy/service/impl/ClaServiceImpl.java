package com.czy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czy.commons.ClassInfo;
import com.czy.dao.ClaMapper;
import com.czy.dao.StuMapper;
import com.czy.entity.Class;
import com.czy.service.IClaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ClaServiceImpl
 * @Description TODO
 * @Author czy61
 * @Date 2019/9/25 19:57
 * @Version 1.0
 */
@Service
public class ClaServiceImpl extends ServiceImpl<ClaMapper, Class> implements IClaService {

    @Autowired
    private ClaMapper claMapper;
    @Autowired
    private StuMapper stuMapper;

    @Override
    public List<ClassInfo> getClassInfo() {
        List<ClassInfo> classInfos = new ArrayList<>();
        List<Class> classes = claMapper.selectClassList();
        for (Class aClass : classes) {
            ClassInfo classInfo = new ClassInfo();
            int num = stuMapper.selectByClassId(aClass.getId());
            classInfo.setId(aClass.getId());
            classInfo.setName(aClass.getName());
            classInfo.setNum(num);
            classInfos.add(classInfo);
        }
        return classInfos;
    }
}
