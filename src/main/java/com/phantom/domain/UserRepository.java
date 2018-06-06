package com.phantom.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户存储类〉
 *
 * @author LLH.
 * @create 2018/6/6
 * @since 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query("select u from User u where u.name=:name")
    User findUser(@Param("name") String name);

    @Query("select u from User u where u.name=:name and u.age = :age")
    User findUserByNameAndAge(@Param("name") String name,@Param("age") int age);
}
