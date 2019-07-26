package com.wuicelone.logmail;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @Auther: wubing
 * @Date: 2019/3/15 09:32
 * @Description:
 */
public class Logtest {
    @Test
    public void logtest() {
        Logger logger = Logger.getLogger(Logtest.class);

        try {
            int i = 0;
            int b = 10;
            int c = b/i;
        } catch (Exception e) {
            // TODO: handle exception
            String currentTime = DateUtils.getCurrentTime12CHS();
            logger.error("异常发生时间："+currentTime,e);
        }
    }
}
