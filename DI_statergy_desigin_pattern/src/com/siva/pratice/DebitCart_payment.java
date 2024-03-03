package com.siva.pratice;

public class DebitCart_payment implements Ipay {

	@Override
	public String pay(double amount) {
		System.out.println("DebitCart_payment:::: "+"pay_Method");
		return "DebitCart_payment success";
	}

}
