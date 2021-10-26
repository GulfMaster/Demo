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
        System.out.println(StartTimeUtil.getMondayOfWeek(new Date()));
        System.out.println(StartTimeUtil.getMondayOfWeek(new Date(), StartTimeUtil.DATE_FORMAT_MILLISECOND));
        System.out.println(StartTimeUtil.getFirstDayOfMonth(new Date()));
        System.out.println(StartTimeUtil.getFirstDayOfMonth(new Date(), StartTimeUtil.DATE_FORMAT_MILLISECOND));
        System.out.println(StartTimeUtil.getTodayStartTime());
        System.out.println(StartTimeUtil.getTodayStartTime(StartTimeUtil.DATE_FORMAT_MILLISECOND));
    }
}
