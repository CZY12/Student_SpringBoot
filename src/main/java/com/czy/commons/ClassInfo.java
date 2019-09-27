package com.czy.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName ClassInfo
 * @Description TODO
 * @Author czy61
 * @Date 2019/9/26 17:13
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ClassInfo implements Serializable {
    private Integer id;
    private String name;
    private Integer num;
}
