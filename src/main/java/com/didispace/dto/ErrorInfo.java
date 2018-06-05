/**
 * Copyright (C), 1995-2018, XXX有限公司
 * FileName: ErrorInfo
 * Author:   wens.
 * Date:     2018/6/4 下午7:46
 * Description: 错误通用传输类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.didispace.dto;

/**
 * 〈一句话功能简述〉<br> 
 * 〈错误通用传输类〉
 *
 * @author wens.
 * @create 2018/6/4
 * @since 1.0.0
 */
public class ErrorInfo<T> {
    public static final Integer OK = 100;
    public static final Integer ERROR = 101;

    private Integer code;
    private String message;
    private String url;
    private T data;

    public static Integer getOK() {
        return OK;
    }

    public static Integer getERROR() {
        return ERROR;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}