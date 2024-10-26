package com.siva;

import org.glassfish.jersey.client.ClientProperties;
import org.json.JSONObject;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.Response;

public class RestFull_web_service_jersey_2_xxx {

public static void Info() {
		final String  methodName = "Info";
		System.out.println(methodName +" START");
		String hostAddress = "";
		Form form = new Form().param(methodName, hostAddress); //forms are used to pass sequrity values 
		Client client = ClientBuilder.newClient();
		WebTarget webtarget = client.target("");
		Response response = webtarget.request().header(hostAddress, webtarget).post(Entity.json(null)); //in header we pass value like token etc....
		if(response.getStatus() == 200) {

		}
		response = webtarget.request().header(hostAddress, webtarget).post(Entity.form(form));
		response = webtarget.request().header(hostAddress, webtarget).get();
		System.out.println(methodName +" END");
}

	public static void main(String[] args) {
		String accesstoken = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImRyVjJrN1RTN3dFR0J6SnQyNVU4bHciLCJ0eXAiOiJhdCtqd3QifQ.eyJuYmYiOjE3MDE1NzkyMzUsImV4cCI6MTcwMTU4MjgzNSwiaXNzIjoiaHR0cHM6Ly9sb2dpbi1zdGFnZS5zb2x1dGlvbnNieXRleHQuY29tIiwiYXVkIjoidDJjYWNjb3VudHMiLCJjbGllbnRfaWQiOiJIUjFFSzY4T01HNTk0SlMyVUxYVyIsInQyY0FjY291bnRJZCI6InN4NTkzYjMiLCJhcGlfY2xpZW50IjoidHJ1ZSIsInRlbmFudF9pZCI6IjkzMTQ3MDkwLTY4MGEtNDkxNy1hM2FiLTk3YmU5OGYwYTZlMyIsImp0aSI6IlNoRnh0TWJsTFhuYW11VkFITU80V0EiLCJzY29wZSI6WyJ0MmMuYWNjb3VudC5hbGxfYnJhbmRzOnIiLCJ0MmMuYWNjb3VudC5pbmZvOnIiLCJ0MmMuYWNjb3VudC5sb29rdXA6ciIsInQyYy5hY2NvdW50LnJlcG9ydHM6ciIsInQyYy5icmFuZC5hbGxfZ3JvdXBzOnIiLCJ0MmMuYnJhbmQucmVwb3J0czpyIiwidDJjLmdyb3VwLmtleXdvcmRzOnIiLCJ0MmMuZ3JvdXAubWVzc2FnZXM6ciIsInQyYy5ncm91cC5zdWJzY3JpYmVyczptIiwidDJjLmdyb3VwLnRlbXBsYXRlbWVzc2FnZTpydyIsInQyYy5ncm91cC50ZW1wbGF0ZXM6ciIsInQyYy5zbWFydGNsaWNrLnJlcG9ydHM6ciJdfQ.TjsIIRNIk4kjqqYg827N-NcrAA__FK3xl3o_TaXHTjzA5VZtYMZAlRY4ZWlNJpLgNLyO8rgazLgtz5Hr6V_0iwZkosSxfijvuvqaRZ25Oe4z7Q8p-5yAZ-UCttiPQV5beH42UwbB7WECGngkd-qQP-hhph1_LeZzm9lvsnskA4b3R6lYq8-P-b7PjVB8d1sQ2EODFrC62HYWLULYynRK4D2GfUEkDl7CGYPhp0goCn40p1sq4l_9lCx2JE9IwSWra6GEoD4MtnjX8L6usHjQlS4kCiJ_frsqCxrylMPQVQmeKHfsBjUidwHa7itg6adtJeJ8Rj-Xr2mEQ2st0Z7wtQ";//getSecurityToken();
		requestVBT(accesstoken);
	}
	//10:24
//accessToken :: eyJhbGciOiJSUzI1NiIsImtpZCI6ImRyVjJrN1RTN3dFR0J6SnQyNVU4bHciLCJ0eXAiOiJhdCtqd3QifQ.eyJuYmYiOjE3MDE1NzkyMzUsImV4cCI6MTcwMTU4MjgzNSwiaXNzIjoiaHR0cHM6Ly9sb2dpbi1zdGFnZS5zb2x1dGlvbnNieXRleHQuY29tIiwiYXVkIjoidDJjYWNjb3VudHMiLCJjbGllbnRfaWQiOiJIUjFFSzY4T01HNTk0SlMyVUxYVyIsInQyY0FjY291bnRJZCI6InN4NTkzYjMiLCJhcGlfY2xpZW50IjoidHJ1ZSIsInRlbmFudF9pZCI6IjkzMTQ3MDkwLTY4MGEtNDkxNy1hM2FiLTk3YmU5OGYwYTZlMyIsImp0aSI6IlNoRnh0TWJsTFhuYW11VkFITU80V0EiLCJzY29wZSI6WyJ0MmMuYWNjb3VudC5hbGxfYnJhbmRzOnIiLCJ0MmMuYWNjb3VudC5pbmZvOnIiLCJ0MmMuYWNjb3VudC5sb29rdXA6ciIsInQyYy5hY2NvdW50LnJlcG9ydHM6ciIsInQyYy5icmFuZC5hbGxfZ3JvdXBzOnIiLCJ0MmMuYnJhbmQucmVwb3J0czpyIiwidDJjLmdyb3VwLmtleXdvcmRzOnIiLCJ0MmMuZ3JvdXAubWVzc2FnZXM6ciIsInQyYy5ncm91cC5zdWJzY3JpYmVyczptIiwidDJjLmdyb3VwLnRlbXBsYXRlbWVzc2FnZTpydyIsInQyYy5ncm91cC50ZW1wbGF0ZXM6ciIsInQyYy5zbWFydGNsaWNrLnJlcG9ydHM6ciJdfQ.TjsIIRNIk4kjqqYg827N-NcrAA__FK3xl3o_TaXHTjzA5VZtYMZAlRY4ZWlNJpLgNLyO8rgazLgtz5Hr6V_0iwZkosSxfijvuvqaRZ25Oe4z7Q8p-5yAZ-UCttiPQV5beH42UwbB7WECGngkd-qQP-hhph1_LeZzm9lvsnskA4b3R6lYq8-P-b7PjVB8d1sQ2EODFrC62HYWLULYynRK4D2GfUEkDl7CGYPhp0goCn40p1sq4l_9lCx2JE9IwSWra6GEoD4MtnjX8L6usHjQlS4kCiJ_frsqCxrylMPQVQmeKHfsBjUidwHa7itg6adtJeJ8Rj-Xr2mEQ2st0Z7wtQ
	//result ::: {"access_token":"eyJhbGciOiJSUzI1NiIsImtpZCI6ImRyVjJrN1RTN3dFR0J6SnQyNVU4bHciLCJ0eXAiOiJhdCtqd3QifQ.eyJuYmYiOjE3MDE1NzkyMzUsImV4cCI6MTcwMTU4MjgzNSwiaXNzIjoiaHR0cHM6Ly9sb2dpbi1zdGFnZS5zb2x1dGlvbnNieXRleHQuY29tIiwiYXVkIjoidDJjYWNjb3VudHMiLCJjbGllbnRfaWQiOiJIUjFFSzY4T01HNTk0SlMyVUxYVyIsInQyY0FjY291bnRJZCI6InN4NTkzYjMiLCJhcGlfY2xpZW50IjoidHJ1ZSIsInRlbmFudF9pZCI6IjkzMTQ3MDkwLTY4MGEtNDkxNy1hM2FiLTk3YmU5OGYwYTZlMyIsImp0aSI6IlNoRnh0TWJsTFhuYW11VkFITU80V0EiLCJzY29wZSI6WyJ0MmMuYWNjb3VudC5hbGxfYnJhbmRzOnIiLCJ0MmMuYWNjb3VudC5pbmZvOnIiLCJ0MmMuYWNjb3VudC5sb29rdXA6ciIsInQyYy5hY2NvdW50LnJlcG9ydHM6ciIsInQyYy5icmFuZC5hbGxfZ3JvdXBzOnIiLCJ0MmMuYnJhbmQucmVwb3J0czpyIiwidDJjLmdyb3VwLmtleXdvcmRzOnIiLCJ0MmMuZ3JvdXAubWVzc2FnZXM6ciIsInQyYy5ncm91cC5zdWJzY3JpYmVyczptIiwidDJjLmdyb3VwLnRlbXBsYXRlbWVzc2FnZTpydyIsInQyYy5ncm91cC50ZW1wbGF0ZXM6ciIsInQyYy5zbWFydGNsaWNrLnJlcG9ydHM6ciJdfQ.TjsIIRNIk4kjqqYg827N-NcrAA__FK3xl3o_TaXHTjzA5VZtYMZAlRY4ZWlNJpLgNLyO8rgazLgtz5Hr6V_0iwZkosSxfijvuvqaRZ25Oe4z7Q8p-5yAZ-UCttiPQV5beH42UwbB7WECGngkd-qQP-hhph1_LeZzm9lvsnskA4b3R6lYq8-P-b7PjVB8d1sQ2EODFrC62HYWLULYynRK4D2GfUEkDl7CGYPhp0goCn40p1sq4l_9lCx2JE9IwSWra6GEoD4MtnjX8L6usHjQlS4kCiJ_frsqCxrylMPQVQmeKHfsBjUidwHa7itg6adtJeJ8Rj-Xr2mEQ2st0Z7wtQ","scope":"t2c.account.all_brands:r t2c.account.info:r t2c.account.lookup:r t2c.account.reports:r t2c.brand.all_groups:r t2c.brand.reports:r t2c.group.keywords:r t2c.group.messages:r t2c.group.subscribers:m t2c.group.templatemessage:rw t2c.group.templates:r t2c.smartclick.reports:r","token_type":"Bearer","expires_in":3600}
	public static String  getSecurityToken () {
		final String methodName = "getSecurityToken";
		System.out.println(methodName  +" Start");
		String accessToken = null;
		String hostAddress = "https://login-stage.solutionsbytext.com/connect/token";
		String clientId = "HR1EK68OMG594JS2ULXW";
		String clintSecret = "Nyerdzu/4Pttm8IUE4j5zeMRV=zuqmSw-Djnnw5sQOaK9S4gxH";
		String grantType = "client_credentials";
		try {
			Form form = new Form().param("grant_type", grantType).
					param("client_secret",clintSecret).
					param("client_id", clientId);
			//String  customerReqData = JSONUtil.convertFormIntoJson(form);
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target(hostAddress);
			Response response = webTarget.request().post(Entity.form(form));
			System.out.println("***SBT response.getStatus()::::::"+response.getStatus());
			String result = "";
			if (response.getStatus() == 200) {
				String output = response.readEntity(String.class);
				JSONObject jsonObj = new JSONObject(output);
				if(jsonObj != null) {
					result = jsonObj.toString();
					accessToken = jsonObj.getString("access_token");
					System.out.println("accessToken :: "+accessToken);
					System.out.println("result ::: "+result);
				}
			} else {
				result = response.readEntity(String.class);
				System.out.println("result ::: "+result);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(methodName  +" End");
		return accessToken;
	}
	public static void requestVBT(String accessToken) {
		final String methodName = "requestVBT";
		System.out.println(methodName  +" Start");
		String thirdPartyResponse = null;
		try {
		String hostAddress = "https://t2c-api-stage.solutionsbytext.com/groups/{groupID}/subscribers";
		hostAddress = "https://t2c-api-stage.solutionsbytext.com/groups/650d871/subscribers";
		JSONObject requestJson = new JSONObject();
		JSONObject verification = new JSONObject();
		requestJson.put("msisdn", "+19374092794");
		
		verification.put("type", "Optin");
		verification.put("force", false);
		requestJson.put("verification", verification);
		System.out.println("requestJson:: "+requestJson);
		Client client = ClientBuilder.newClient();
		client.property(ClientProperties.CONNECT_TIMEOUT, Integer.parseInt("30") * 1000);
		client.property(ClientProperties.READ_TIMEOUT,    Integer.parseInt("30") * 1000);
		WebTarget webTarget = client.target(hostAddress);
		System.out.println("requestJson:: "+requestJson);
		Response response = webTarget.request().header("Authorization","Bearer "+accessToken).post(Entity.json(requestJson));
		//javax.ws.rs.core.Response response = webTarget.request().header("Authorization","Bearer "+accessToken).get(); //for geting response without request 
		System.out.println("***SBT response.getStatus()::::::"+response.getStatus());
		if (response.getStatus() == 200) {
			thirdPartyResponse = response.readEntity(String.class);
			System.out.println("thirdPartyResponse ::: "+thirdPartyResponse);
		} else {
			thirdPartyResponse  = response.readEntity(String.class);
			System.out.println("thirdPartyResponse ::: "+thirdPartyResponse);
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(methodName  +" End");
	}
}