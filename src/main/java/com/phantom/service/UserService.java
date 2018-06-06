package com.phantom.service;

import com.phantom.domain.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户服务类〉
 *
 * @author LLH.
 * @create 2018/6/5
 * @since 1.0.0
 */
public interface UserService {

    /**
     * 新增一个用户
     *
     * @param name
     * @param age
     */
    void create(String name, Integer age, Long id);

    /**
     * 根据name删除一个用户高
     *
     * @param name
     */
    void deleteByName(String name);


    /**
     * 获取所有用户
     *
     * @return
     */
    List<User> getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();

    /**
     * 获取用户总量
     *
     * @return
     */
    Integer getAllUsersAcount();

}
