package com.czetsuyatech.data.literal;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 * @version
 */
@Qualifier
@Retention(RUNTIME)
@Target(TYPE)
public @interface InvestmentServiceFor {

	String value();
}
