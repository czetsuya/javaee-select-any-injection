package com.czetsuyatech.data.entity;

import java.math.BigDecimal;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 * @version
 */
// @Entity
public class Investment extends BaseEntity {

	public static final String UNDEFINED = "UNDEFINED";

	public BigDecimal amount;
	public Integer noOfYears;

	public String getInvestmentType() {
		return UNDEFINED;
	}
}
