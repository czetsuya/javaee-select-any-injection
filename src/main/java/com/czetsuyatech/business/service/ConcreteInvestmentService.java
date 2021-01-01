package com.czetsuyatech.business.service;

import java.math.BigDecimal;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import com.czetsuyatech.data.entity.Investment;
import com.czetsuyatech.data.literal.InvestmentServiceLiteral;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 * @version
 */
@ApplicationScoped
public class ConcreteInvestmentService extends InvestmentService<Investment> {

	@Inject
	@Any
	private Instance<InvestmentService<?>> investmentServiceInst;

	public InvestmentService<?> getInvestmentService(Investment investment) {

		String investmentType = investment.getInvestmentType();
		InvestmentServiceLiteral literal = new InvestmentServiceLiteral(investmentType);

		return investmentServiceInst.select(literal).get();
	}

	public BigDecimal computeInterest(Investment investment) {

		InvestmentService<?> investmentService = getInvestmentService(investment);
		return investmentService.computeInterest(investment);
	}
}
