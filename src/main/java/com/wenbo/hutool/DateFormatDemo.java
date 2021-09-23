package com.wenbo.hutool;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author: liwenbo
 * @date: 2021-09-22 10:05:41
 * @desc: hutool的时间格式转换demo
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        String dateStr = "2017-03-01";
        Date date = DateUtil.parse(dateStr);

        System.out.println(DateUtil.format(new Date(), DatePattern.NORM_DATETIME_MS_FORMAT));
        System.out.println(DateUtil.format(new Date(), DatePattern.NORM_DATETIME_FORMAT));
        //结果 2017/03/01
        String format = DateUtil.format(date, "yyyy/MM/dd");
        System.out.println(format);
        //常用格式的格式化，结果：2017-03-01
        String formatDate = DateUtil.formatDate(new Date());
        System.out.println(formatDate);

        //结果：2017-03-01 00:00:00
        String formatDateTime = DateUtil.formatDateTime(date);
        System.out.println(formatDateTime);

        //结果：00:00:00
        String formatTime = DateUtil.formatTime(date);
        System.out.println(formatTime);


    }
}
