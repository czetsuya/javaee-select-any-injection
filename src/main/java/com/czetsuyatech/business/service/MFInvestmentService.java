package com.czetsuyatech.business.service;

import java.math.BigDecimal;

import javax.enterprise.context.ApplicationScoped;

import com.czetsuyatech.data.entity.Investment;
import com.czetsuyatech.data.entity.MFInvestment;
import com.czetsuyatech.data.literal.InvestmentServiceFor;

import io.smallrye.common.constraint.Assert;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 * @version
 */
@InvestmentServiceFor(MFInvestment.TYPE)
@ApplicationScoped
public class MFInvestmentService extends InvestmentService<MFInvestment> {

	public static final BigDecimal INTEREST_RATE = BigDecimal.valueOf(.07);

	/**
	 * Pretend that the computation is more complicated and isolated as it is :-)
	 */
	@Override
	public BigDecimal computeInterest(Investment investment) {

		Assert.assertNotNull(investment);
		Assert.assertNotNull(investment.amount);
		Assert.assertNotNull(investment.noOfYears);

		return investment.amount.multiply(INTEREST_RATE).multiply(new BigDecimal(investment.noOfYears));
	}
}