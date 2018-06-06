/**
 * Copyright (C), 1995-2018, XXX有限公司
 * FileName: BlogProperties
 * Author:   wens.
 * Date:     2018/5/30 下午7:39
 * Description: 博客的配置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.phantom.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈博客的配置〉
 *
 * @author wens.
 * @create 2018/5/30
 * @since 1.0.0
 */
@Component
public class BlogProperties {

    @Value("${com.phantom.blog.name}")
    private String name;
    @Value("${com.phantom.blog.title}")
    private String title;
    @Value("${com.phantom.blog.desc}")
    private String desc;
    @Value("${com.phantom.blog.value}")
    private String value;
    @Value("${com.phantom.blog.number}")
    private Integer number;
    @Value("${com.phantom.blog.bignumber}")
    private Long bignumber;
    @Value("${com.phantom.blog.test1}")
    private Integer test1;
    @Value("${com.phantom.blog.test2}")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }
}