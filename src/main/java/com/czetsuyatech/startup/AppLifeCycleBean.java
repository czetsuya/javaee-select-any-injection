package com.czetsuyatech.startup;

import java.math.BigDecimal;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.czetsuyatech.business.service.ConcreteInvestmentService;
import com.czetsuyatech.data.entity.Investment;
import com.czetsuyatech.data.entity.MFInvestment;
import com.czetsuyatech.data.entity.UITFInvestment;

import io.quarkus.runtime.StartupEvent;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 * @version
 */
@ApplicationScoped
public class AppLifeCycleBean {

	private Logger log = LoggerFactory.getLogger(AppLifeCycleBean.class);

	@Inject
	private ConcreteInvestmentService concreteInvestmentService;

	public void onStartup(@Observes StartupEvent se) {

		log.info("\n-----------------------------------");
		log.info("Welcome to CzetsuyaTech");
		log.info(
				"This project demonstrates how we can select a service injected using @Any annotation using a TYPE at run time.");
		log.info("Support the author: http://patreon.com/czetsuya");
		log.info("\n-----------------------------------");

		// Let's run some tests here
		log.info("\n-----------------------------------");
		log.debug("Get MFInvestmentService at runtime");
		Investment investment = new MFInvestment();
		investment.amount = new BigDecimal(1000);
		investment.noOfYears = 12;
		BigDecimal interest = concreteInvestmentService.computeInterest(investment);
		log.info("The interest computed for Mutual Fund is={}. The correct value is 840.", interest);

		log.info("\n-----------------------------------");
		log.debug("Get UITFInvestmentService at runtime");
		investment = new UITFInvestment();
		investment.amount = new BigDecimal(1000);
		investment.noOfYears = 12;
		interest = concreteInvestmentService.computeInterest(investment);
		log.info("The interest computed for UITF is={}. The correct value is 1440", interest);
	}
}
