package com.czetsuyatech.data.literal;

import javax.enterprise.util.AnnotationLiteral;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 * @version
 */
public class InvestmentServiceLiteral extends AnnotationLiteral<InvestmentServiceFor> implements InvestmentServiceFor {

	private static final long serialVersionUID = -2002577483256212163L;
	private String value;

	public InvestmentServiceLiteral(String value) {
		super();
		this.value = value;
	}

	public String value() {
		return this.value;
	}

}
