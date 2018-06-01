/**
 * Copyright (C), 1995-2018, XXX有限公司
 * FileName: UserController
 * Author:   wens.
 * Date:     2018/5/31 下午4:26
 * Description: 用户网络查询
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.didispace.Chapter1.web;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户网络查询〉
 *
 * @author wens.
 * @create 2018/5/31
 * @since 1.0.0
 */

        import com.didispace.Chapter1.domain.User;
        import org.springframework.web.bind.annotation.*;

        import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

    /**
     *
     * @param user
     * @return
     */
    @RequestMapping(value="/",method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        users.put(user.getId(),user);
        return "success";
    }

    /**
     * 处理url里的id查询
     * @param id
     * @return
     */
    @RequestMapping("/{id}")
    public User getUser(@PathVariable long id){
        //处理url里的id查询
        return users.get(id);
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public String putUser(@PathVariable long id,@ModelAttribute User user){

        users.put(id,user);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        users.remove(id);
        return "success";
    }
}