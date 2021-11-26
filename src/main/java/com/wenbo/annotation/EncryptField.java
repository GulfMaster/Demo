package com.wenbo.annotation;

import java.lang.annotation.*;

/**
 * 需要加密的字段
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface EncryptField {
}
