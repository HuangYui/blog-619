package com.blog.controller.exception;

import com.blog.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class MyExceptionHandler {

    @ExceptionHandler(value =Exception.class)
	@ResponseBody
	public Response<?> exceptionHandler(Exception e){
		System.out.println("未知异常！原因是:"+e);
		log.error(e.getMessage());
       	return Response.error("500","系统异常,请联系管理员");
    }
}