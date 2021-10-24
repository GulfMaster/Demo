package com.wenbo.encrypt;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;


/**
 * @author: liwenbo
 * @date: 2021-10-21 09:05:28
 * @desc: AES 加解密 Demo
 */
public class AesDemo {
    private static byte[] AES_KEY = "ABCDEFGHIJABCDEF".getBytes();
    private static AES aes = SecureUtil.aes(AES_KEY);
    public static void main(String[] args) {
        showEncrypt("17751001234");
        showEncrypt("12345678901234567890123456789012345678901234567890@qq.com");
//        showEncrypt("");
//        showEncrypt(null);
    }
    private static void showEncrypt(String str){
        String encryptStr = aes.encryptBase64(str);
        System.out.println("原始数据："+str);
        System.out.println("加密后："+encryptStr);
        System.out.println("原始长度："+str.length());
        System.out.println("加密后长度："+encryptStr.length());
    }
}
