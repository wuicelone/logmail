package com.wuicelone.logmail;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Auther: wubing
 * @Date: 2019/3/15 09:33
 * @Description:
 */
public class DateUtils {
    public static String getCurrentTime24(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        return currentTime;
    }

    public static String getCurrentTime12EN(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss", Locale.ENGLISH);
        String currentTime = dateFormat.format(new Date());
        return currentTime;
    }

    public static String getCurrentTime12CHS(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        String currentTime = dateFormat.format(new Date());
        return currentTime;
    }
}
