package com.siva;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiHelper {

	public static String processRequest(CompleteRequests allreq) {
		System.out.println("processRequest:::::start:");
		String reqCode = allreq.getReqCode();
		String mapToJSON = "";
		try {
			if("post".equalsIgnoreCase(reqCode)) {
				TestBeanReq testbean = allreq.getTestBeanReq();
				System.out.println("testbean:::::::::::"+testbean);
				
				Map<String,TestBeanReq> map = new HashMap<>();
				ObjectMapper objMapper = new ObjectMapper();
				map.put("response",testbean);
				mapToJSON  = objMapper.writeValueAsString(map);
			}
		}catch(Exception e) {
			
		}
		System.out.println("processRequest:::::end:");
		return mapToJSON;
	}
}
