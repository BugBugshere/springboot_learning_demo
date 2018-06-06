/**
 * Copyright (C), 1995-2018, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   wens.
 * Date:     2018/6/5 上午11:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.phantom.service.impl;

import com.phantom.domain.User;
import com.phantom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author wens.
 * @create 2018/6/5
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age, Long id) {
        jdbcTemplate.update("INSERT INTO phantom_user(name, age, id) VALUES(?, ?,?)", name, age, id);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("DELETE FROM phantom_user WHERE name = ?", name);

    }

    @Override
    public Integer getAllUsersAcount() {
        return jdbcTemplate.queryForObject("SELECT COUNT(1) FROM phantom_user", Integer.class);
    }

    @Override
    public List<User> getAllUsers() {
        return jdbcTemplate.query("SELECT id,name,age FROM phantom_user ", new BeanPropertyRowMapper(User.class));
    }


    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("DELETE FROM phantom_user ");
    }

}