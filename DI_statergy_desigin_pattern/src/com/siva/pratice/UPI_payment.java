package com.siva.pratice;

public class UPI_payment implements Ipay {

	@Override
	public String pay(double amount) {
		System.out.println("UPI_payment::::: pay");
		return "UPI_payment success";
	}

}
