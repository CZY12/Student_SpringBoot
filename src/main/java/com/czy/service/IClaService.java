package com.czy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czy.commons.ClassInfo;
import com.czy.entity.Class;

import java.util.List;

public interface IClaService extends IService<Class> {
    List<ClassInfo> getClassInfo();
}
