# JavaEE Inline Instantiation of Annotation Type Instances

This project demonstrates how we can select a service injected using @Any annotation using a Literal at run time.

## Return a Service Based on Literal Annotation

```sh
public InvestmentService<?> getInvestmentService(Investment investment) {

	String investmentType = investment.getInvestmentType();
	InvestmentServiceLiteral literal = new InvestmentServiceLiteral(investmentType);

	return investmentServiceInst.select(literal).get();
}
```

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```