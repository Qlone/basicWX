package com.wx.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class LogUtil {
    /**
     * ctmd  lombok不能用
     *
     * 辣鸡
     **/
    public static HashMap<String,PrintUtil> factory = new HashMap<>();

    private LogUtil(){

    };

    public static PrintUtil context(Class aclass){
        //缓存对应class中打印日志的类
        PrintUtil printUtil = factory.get(aclass.getName());
        if(printUtil == null) {
            Logger logger  = LoggerFactory.getLogger(aclass);
            printUtil = new PrintUtil(logger);
            factory.put(aclass.getName(),printUtil);
        }
        return printUtil;
    }
    public static PrintUtil context(Object object){
        return context(object.getClass());
    }

}
