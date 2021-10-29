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
        System.out.println(StartTimeUtil.getFirstDayOfSomeMonth(new Date(),-1));
        System.out.println(EsParamUtil.getEsSearchTimeStr(StartTimeUtil.getFirstDayOfSomeMonth(new Date(),-1)));
        System.out.println(StartTimeUtil.getMaxDayNumOfSomeMonth(new Date(),-1));

        System.out.println(EsParamUtil.getEsSearchTimeStr(StartTimeUtil.getFirstDayOfSomeMonth(new Date(),0)));
        System.out.println(StartTimeUtil.getMaxDayNumOfSomeMonth(new Date(),0));

        System.out.println(EsParamUtil.getEsSearchTimeStr(StartTimeUtil.getFirstDayOfSomeMonth(new Date(),1)));
        System.out.println(StartTimeUtil.getMaxDayNumOfSomeMonth(new Date(),1));

        System.out.println(EsParamUtil.getEsSearchTimeStr(StartTimeUtil.getFirstDayOfSomeMonth(new Date(),2)));
        System.out.println(StartTimeUtil.getMaxDayNumOfSomeMonth(new Date(),2));

        System.out.println(EsParamUtil.getEsSearchTimeStr(StartTimeUtil.getFirstDayOfSomeMonth(new Date(),3)));
        System.out.println(StartTimeUtil.getMaxDayNumOfSomeMonth(new Date(),3));

        System.out.println(EsParamUtil.getEsSearchTimeStr(StartTimeUtil.getFirstDayOfSomeMonth(new Date(),4)));
        System.out.println(StartTimeUtil.getMaxDayNumOfSomeMonth(new Date(),4));

    }
}
