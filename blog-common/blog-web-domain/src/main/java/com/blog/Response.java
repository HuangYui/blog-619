package com.blog;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Data
@Slf4j
public class Response<T> {

    /**
     * 是否成功
     */
    private Boolean success;
    /**
     * 返回数据
     */
    @ApiModelProperty(value = "返回数据", position = 2)
    private T data;
    /**
     * 错误编码
     */
    @ApiModelProperty(value = "错误编码", position = 3)
    private String errorCode;
    /**
     * 错误消息
     */
    @ApiModelProperty(value = "错误消息", position = 4)
    private String errorMessage;
    /**
     * 返回消息
     */
    @ApiModelProperty(value = "返回消息", position = 4)
    private String message;

    public static <T> Response<T> ok(T data){
        Response<T> response = new Response<>();
        response.setSuccess(true);
        response.setData(data);
        return response;
    }

    public static <T> Response<T> ok(String message){
        Response<T> response = new Response<>();
        response.setSuccess(true);
        response.setMessage(message);
        return response;
    }

    public static <T> Response<T> error(String errorCode, String msg){
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(errorCode);
        response.setErrorMessage(msg);
        return response;
    }

    public static <T> Response<T> error(String errorCode){
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(errorCode);
        response.setErrorMessage(errorCode);
        return response;
    }

    public static <T> Response<T> ok(){
        Response<T> response = new Response<>();
        response.setSuccess(true);
        return response;
    }

}
