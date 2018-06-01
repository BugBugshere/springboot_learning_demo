/**
 * Copyright (C), 1995-2018, XXX有限公司
 * FileName: User
 * Author:   wens.
 * Date:     2018/5/31 下午4:24
 * Description: 用户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.didispace.domain;

import org.springframework.context.annotation.Bean;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户〉
 *
 * @author wens.
 * @create 2018/5/31
 * @since 1.0.0
 */
public class User {
    private long id;
    private String name;
    private Integer age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}