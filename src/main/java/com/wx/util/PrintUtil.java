package com.wx.util;

import org.slf4j.Logger;

public class PrintUtil {

    private Logger logger;
    private PrintUtil(){

    };


    protected PrintUtil(Logger logger){
        this.logger = logger;
    };


    public PrintUtil error(String msg){
        logger.error(msg);
        return this;
    }
    public PrintUtil error(String msg,Throwable e){
        logger.error(msg,e);
        return this;
    }

    public PrintUtil info(String msg){
        logger.info(msg);
        return this;
    }
}
