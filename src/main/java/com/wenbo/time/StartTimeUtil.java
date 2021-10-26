package com.wenbo.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: liwenbo
 * @date: 2021-09-22 09:32:43
 * @desc: 获取本周的开始时间
 */
public class StartTimeUtil {
    public static final SimpleDateFormat DATE_FORMAT_SECOND = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat DATE_FORMAT_MILLISECOND = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    /**
     * 获取日期所在星期的周一零点
     * @param date 需要计算的日期
     * @return 指定日期的周一0点
     */
    public static Date getMondayOfWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 设置周一为第一天
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 时间设置到周一，此时时间为周一的日期
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        // 将时分秒毫秒置零
        setHourMinuteSecondMillisecondZero(cal);
        return cal.getTime();
    }

    /**
     * 返回日期所在星期的周一零点的String类型
     * @param date 需要计算的日期
     * @param sdf 日期格式
     * @return String
     */
    public static String getMondayOfWeek(Date date,SimpleDateFormat sdf)  {
        Date thisWeekMonday = getMondayOfWeek(date);
        return sdf.format(getMondayOfWeek(thisWeekMonday));
    }

    /**
     * 获取日期所在星期的周一零点
     * @param date 需要计算的日期
     * @return 指定日期的周一0点
     */
    public static Date getFirstDayOfMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        // 将时分秒毫秒置零
        setHourMinuteSecondMillisecondZero(cal);
        return cal.getTime();
    }

    /**
     * 返回日期所在星期的周一零点的String类型
     * @param date 需要计算的日期
     * @param sdf 日期格式
     * @return String
     */
    public static String getFirstDayOfMonth(Date date,SimpleDateFormat sdf)  {
        Date thisWeekMonday = getFirstDayOfMonth(date);
        return sdf.format(getFirstDayOfMonth(thisWeekMonday));
    }

    /**
     * 获取当日的零时零分零秒
     */
    public static Date getTodayStartTime() {
        Calendar cal = Calendar.getInstance();
        // 将时分秒毫秒置零
        setHourMinuteSecondMillisecondZero(cal);
        return cal.getTime();
    }

    /**
     * 获取当日的零时零分零秒
     */
    public static String getTodayStartTime(SimpleDateFormat sdf)  {
        Date thisWeekMonday = getTodayStartTime();
        return sdf.format(getTodayStartTime());
    }

    /**
     * 将时分秒毫秒置零
     */
    public static void setHourMinuteSecondMillisecondZero(Calendar calendar){
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    }

}
