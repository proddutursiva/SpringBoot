package com.siva.pratice;

public class Bill_collector {
private Ipay ipay;

public void setIpay(Ipay ipay) {
	this.ipay = ipay;
}

public Bill_collector(DebitCart_payment debitCart_payment) {
	System.out.println("constructor:::");
	this.ipay = debitCart_payment;
}
	public void pay(double amount) {
		System.out.println("Bill_collector::::::pay");
		String status = ipay.pay(amount);
		System.out.println("status:::: "+status);
	}
}
