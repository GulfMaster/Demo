package com.wenbo.domain;

import com.wenbo.annotation.EncryptField;

/**
 * @author: liwenbo
 * @date: 2021-10-09 10:34:17
 * @desc: 默认值测试
 */
public class Person {
    private String name;
    private int age;
    private boolean isMale;
    @EncryptField
    private String phone;
    @EncryptField
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
