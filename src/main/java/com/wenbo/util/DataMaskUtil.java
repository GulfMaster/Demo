package com.wenbo.util;

import cn.hutool.core.util.StrUtil;

/**
 * @author: liwenbo
 * @date: 2021-11-23 15:05:05
 * @desc: 数据脱敏工具类
 */
public class DataMaskUtil {
    /**
     * 占位符
     */
    public static final String MASK = "*";

    /**
     * 脱敏保留的字符长度
     */
    private static final int BEGIN_MASK_LENGTH = 3;

    /**
     * 脱敏保留的字符 后脱敏字符长度
     */
    private static final int SUFFIX_LENGTH = 4;

    /**
     * 实现手机号前三后四脱敏
     *
     * @param msg
     * @return
     */
    public static String maskPhone(String msg) {
        if(msg.matches(RegularUtil.PHONE)){
            return msg.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        }
        return mask(msg);
    }

    /**
     * 如果字符串长度大于 3，则保留前 3 位，剩余位置补 4 个 *
     * 如果字符串长度小于 3，则全部字符替换为 *
     *
     * @param msg
     * @return
     */
    public static String mask(String msg) {
        return mask(msg, BEGIN_MASK_LENGTH, SUFFIX_LENGTH);
    }

    /**
     * 如果字符串长度大于 beginMaskLength，则保留前 beginMaskLength 位，剩余位置补 suffixLength 个*
     * 如果字符串长度小于beginMaskLength，则全部字符替换为*
     *
     * @param msg
     * @param beginMaskLength
     * @param suffixLength
     * @return
     */
    public static String mask(String msg, int beginMaskLength, int suffixLength) {
        if (StrUtil.isEmpty(msg)) {
            return msg;
        }
        int msgLength = msg.length();
        StringBuilder sb = new StringBuilder();
        if (msgLength <= beginMaskLength) {
            for (int i = 0; i < msgLength; i++) {
                sb.append(MASK);
            }
            return sb.toString();
        }
        sb.append(msg, 0, beginMaskLength);
        for (int i = 0; i < suffixLength; i++) {
            sb.append(MASK);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(maskPhone("17700001234"));
        System.out.println(maskPhone("82854723"));
        System.out.println(maskPhone("13183335310"));
        System.out.println(maskPhone("12"));
        System.out.println(maskPhone("123"));
        System.out.println(maskPhone("123456"));
    }
}
