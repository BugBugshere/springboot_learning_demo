/**
 * Copyright (C), 1995-2018, XXX有限公司
 * FileName: MyException
 * Author:   wens.
 * Date:     2018/6/4 下午7:16
 * Description: 我的通用异常类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.didispace.exception;

import com.didispace.dto.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br> 
 * 〈我的通用异常处理类〉
 *
 * @author wens.
 * @create 2018/6/4
 * @since 1.0.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error"; //默认错误视图


    @ExceptionHandler( Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest httpServletRequest,Exception e) throws Exception{
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",e);
        mav.addObject("url",httpServletRequest.getRequestURL());
        mav.addObject("auditor","BUGBUGSHERE_爸爸在这儿");
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandle(HttpServletRequest httpServletRequest, MyException e) throws Exception{
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setCode(ErrorInfo.ERROR);
        r.setData(String.valueOf(Math.PI));
        r.setMessage("发生错误啦，赶紧检查检查");
        r.setUrl("www.bilibili.com");
        return r;
    }
}