package com.will.iotmanager;

import org.springframework.util.ObjectUtils;

public class Utils {

    public static boolean isEmpty(Object obj) {
        return obj == null || ObjectUtils.isEmpty(obj);
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    public static <T> T nvl(Object originalInstance, T returnIfNull) {
        if (originalInstance instanceof String) {
            if (((String) originalInstance).trim().isEmpty()) {
                return returnIfNull;
            }
        }
        return isEmpty(originalInstance) ? returnIfNull : (T)originalInstance;
    }

}
