package com.wenbo.time;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author: liwenbo
 * @date: 2021-11-23 14:52:27
 * @desc: 
 */
public class DateUtilDemo {
    public static void main(String[] args) {
        Date date = DateUtil.date();
        System.out.println(DateUtil.dayOfMonth(new Date()));
        System.out.println(DateUtil.dayOfWeek(new Date()));
        System.out.println(DateUtil.dayOfWeekEnum(new Date()));
        System.out.println(DateUtil.dayOfYear(new Date()));
        System.out.println("--------------------");
        System.out.println(DateUtil.thisDayOfMonth());
        System.out.println(DateUtil.thisDayOfWeek());

    }
}
