package com.czy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czy.entity.Class;

import java.util.List;

public interface ClaMapper extends BaseMapper<Class> {
    List<Class> selectClassList();
}
