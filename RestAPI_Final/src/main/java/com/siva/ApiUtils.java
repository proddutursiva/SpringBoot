package com.siva;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletRequest;

public class ApiUtils {
	
	public static void getHttpServeletRequest(HttpServletRequest request) {
		System.out.println("getHttpServeletRequest::::start");
		String requestURI = request.getRequestURI();
		String clientIp = request.getRemoteAddr();
		String method = request.getMethod();
		String getRemoteHost = request.getRemoteHost();
		System.out.println("requestURI:::::::::"+requestURI);
		System.out.println("clientIp:::::::::"+clientIp);
		System.out.println("method:::::::::"+method);
		System.out.println("getRemoteHost:::::::::"+getRemoteHost);
		System.out.println("getHttpServeletRequest::::end");
	}
	
	public static void getReqHeaders(Map<String,String> headers) {
		
		System.out.println("getReqHeaders::::start");
        headers.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("getReqHeaders::::end");
	}
	
	public static void getReqParams(Map<String,String> parms) {
		System.out.println("getReqParams:::::start:");
		parms.forEach((key, value) -> System.out.println(key + ": " + value));
		System.out.println("getReqParams:::::end:");
	}
	
	public static boolean  validateJSON(String req) {
		System.out.println("validateJSON:::::start:");
		boolean flag =false;
		ObjectMapper objmapper = new ObjectMapper();
		try{
			objmapper.readTree(req);
			flag =true;
			System.out.println("validateJSON:::::end:");
			return flag;
		}catch(Exception e) {
			System.out.println("validateJSON:::::end:");
			return flag;
		}
		
	}
	
	public static void jsonTOBean(CompleteRequests allreq) {
		ObjectMapper objMapper = new ObjectMapper();
		System.out.println("jsonTOBean:::::start:");
		try {
			String reqCode = allreq.getReqCode();
			
		if( reqCode!= null && reqCode !="") {
			if("post".equalsIgnoreCase(reqCode)) {
				TestBeanReq testBeanReq = objMapper.readValue(allreq.getRequest(), TestBeanReq.class);
				allreq.setTestBeanReq(testBeanReq);
			}
		}
		}catch(Exception e) {
			System.out.println("error:::value:::::"+e.getMessage());
		}
		
		System.out.println("jsonTOBean:::::end:");
	}

	public static String mapToJSON(Map<String,String> map) {
		System.out.println("mapToJSON:::::end:");
		String res = "";
		try {
		ObjectMapper objMapper = new ObjectMapper();
		if(map != null) {
			res = objMapper.writeValueAsString(map);
		}
		}catch(Exception e) {
			
		}
		System.out.println("mapToJSON:::::end:");
		return res;
		
	}
	
}
