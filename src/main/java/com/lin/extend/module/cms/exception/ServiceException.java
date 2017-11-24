package com.lin.extend.module.cms.exception;

/**
 * @Author: cat-lin
 * @Description: ServiceException
 * @Date: Create in 00:05 17/7/2
 * @Modified by:
 */
public class ServiceException extends RuntimeException {

    public ServiceException(){

    }

    public ServiceException(String message){
        super(message);
    }

    public ServiceException(String message, Throwable cause){
        super(message ,cause);
    }

}
