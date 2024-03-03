package com.siva;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Moter implements InitializingBean, DisposableBean {

	public Moter() {
		System.out.println("Moter::::: constructor");
	}

	@Override
	public void destroy() throws Exception {
System.out.println("destroy:::: ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
System.out.println("afterPropertiesSet:::::: ");
	}

}
