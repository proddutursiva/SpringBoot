package com.siva;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestBeanResponse {
	@JsonProperty
	public String res;

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	@Override
	public String toString() {
		return "TestBeanResponse [res=" + res + "]";
	}
	

}
