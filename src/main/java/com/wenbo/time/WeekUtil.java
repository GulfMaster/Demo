package com.wenbo.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: liwenbo
 * @date: 2021-09-22 09:32:43
 * @desc: 获取本周的开始时间
 */
public class WeekUtil {
    public static final SimpleDateFormat DATE_FORMAT_SECOND = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat DATE_FORMAT_MILLISECOND = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 获取日期所在星期的周一零点
     * @param date 需要计算的日期
     * @return 指定日期的周一0点
     */
    public static Date getThisWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        // 将时分秒毫秒置零
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    /**
     * 返回日期所在星期的周一零点的String类型
     * @param date 需要计算的日期
     * @param sdf 日期格式
     * @return String
     */
    public static String getThisWeekMonday(Date date,SimpleDateFormat sdf)  {
        Date thisWeekMonday = getThisWeekMonday(date);
        return sdf.format(getThisWeekMonday(thisWeekMonday));
    }
}
