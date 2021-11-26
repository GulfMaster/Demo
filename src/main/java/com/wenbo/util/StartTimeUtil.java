package com.wenbo.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: liwenbo
 * @date: 2021-09-22 09:32:43
 * @desc: 获取某个时间点所在周和月的开始时间
 */
public class StartTimeUtil {
    public static final String DATE_FORMAT_SECOND = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_MILLISECOND = "yyyy-MM-dd HH:mm:ss.SSS";

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
     * @param format 日期格式
     * @return String
     */
    public static String getMondayOfWeek(Date date, String format)  {
        Date thisWeekMonday = getMondayOfWeek(date);
        return new SimpleDateFormat(format).format(getMondayOfWeek(thisWeekMonday));
    }

    /**
     * 获取日期所在月的周一零点
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
     * 返回日期所在月的周一零点的String类型
     * @param date 需要计算的日期
     * @param format 日期格式
     * @return String
     */
    public static String getFirstDayOfMonth(Date date, String format)  {
        Date thisWeekMonday = getFirstDayOfMonth(date);
        return new SimpleDateFormat(format).format(getFirstDayOfMonth(thisWeekMonday));
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
    public static String getTodayStartTime(String format)  {
        Date thisWeekMonday = getTodayStartTime();
        return new SimpleDateFormat(format).format(getTodayStartTime());
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

    /**
     * 根据某个日期 获取 某月的第一天 零时零分零秒
     * 正整数 表示传入日期之后某个月
     * 负数 表示传入日期之前的某个月
     * @param date 基准日期
     * @param num 偏移量
     * @return 指定月份的第一天 零时零分零秒
     */
    public static Date getFirstDayOfSomeMonth(Date date,int num) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, num);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        // 将时分秒毫秒置零
        setHourMinuteSecondMillisecondZero(cal);
        return cal.getTime();
    }
    /**
     * 根据某个日期 获取 某月的 天数
     * 正整数 表示传入日期之后某个月
     * 负数 表示传入日期之前的某个月
     * @param date 基准日期
     * @param num 偏移量
     * @return 月份的天数
     */
    public static int getMaxDayNumOfSomeMonth(Date date,int num) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, num);
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
