package com.siva.pratice;

import java.lang.reflect.Field;

public class main_Method {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		//Bill_collector bc = new Bill_collector(new DebitCart_payment());
		//bc.setIpay(new UPI_payment());
		//bc.setIpay(new DebitCart_payment());
		//bc.pay(1000.00);
		Class<?> clas = Class.forName("com.siva.pratice.Bill_collector");
		Field field = clas.getDeclaredField("ipay");
		field.setAccessible(true);
		Object obj = clas.newInstance();
		field.set(obj, new UPI_payment());
		Bill_collector bc = (Bill_collector)obj;
		bc.pay(1000);
	}

}
