package com.czetsuyatech.business.service;

import java.math.BigDecimal;

import com.czetsuyatech.data.entity.Investment;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 * @version
 */
public abstract class InvestmentService<T extends Investment> extends BusinessService<T> {

	public abstract BigDecimal computeInterest(Investment investment);

}
