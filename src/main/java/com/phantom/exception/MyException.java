/**
 * Copyright (C), 1995-2018, XXX有限公司
 * FileName: MyException
 * Author:   wens.
 * Date:     2018/6/4 下午7:48
 * Description: 我的通用异常类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.phantom.exception;

/**
 * 〈一句话功能简述〉<br> 
 * 〈我的通用异常类〉
 *
 * @author wens.
 * @create 2018/6/4
 * @since 1.0.0
 */
public class MyException extends Exception{

    /**
     * 显示声明构造器
     * @param message
     */
    public MyException(String message) {
        super(message);
    }
}