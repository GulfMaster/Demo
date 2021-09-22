package com.wenbo.time;

import java.util.Date;

/**
 * @author: liwenbo
 * @date: 2021-09-22 09:43:17
 * 
 * @desc: 
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(WeekUtil.getThisWeekMonday(new Date(),WeekUtil.DATE_FORMAT_MILLISECOND));
    }
}
