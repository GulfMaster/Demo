package com.wenbo.demo;

import com.wenbo.annotation.EncryptField;
import com.wenbo.domain.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author: liwenbo
 * @date: 2021-10-23 13:01:06
 * @desc: 通过注解获取对象属性值
 */
public class AnnotaionDemo {
    public static void main(String[] args) {
        Person person = new Person();
//        person.setEmail("123@qq.com");
//        person.setPhone("177123456789");

        Class cls = person.getClass();
        System.out.println(cls);
        // 获取已声明的属性
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("---------------");
            System.out.println(field);
            // 获取属性上的注解
            Annotation[] annotations = field.getAnnotations();
            // 属性的访问修饰符
            System.out.println(field.getModifiers());
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
            if (field.getAnnotation(EncryptField.class) != null) {
                System.out.println("有加密注解");
                System.out.println(field.getType() == String.class);
                System.out.println(field.getType().equals(String.class));
                // 设置类的私有字段属性可访问
                field.setAccessible(true);
                try {
                    System.out.println((String) field.get(person));
                    field.set(person,"我修改了"+field.getName());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("=================");
        // 获取类的注解
        Annotation[] annotations = cls.getAnnotations();
        System.out.println(annotations);
        for (Annotation classAnnotation : annotations) {
            System.out.println(classAnnotation);
        }
        System.out.println(person);
    }
}
