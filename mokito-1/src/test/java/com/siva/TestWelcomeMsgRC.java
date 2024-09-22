package com.siva;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.siva.rest.RestController_1;
import com.siva.service.WelcomeService_1;

@WebMvcTest(value = RestController_1.class)
public class TestWelcomeMsgRC {
	
	@MockBean
	private WelcomeService_1 welcomeservice;
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getwelocmeMsg() throws Exception{
		when(welcomeservice.getWelcomeMsg()).thenReturn("Welcome msg from TestWelcomeMsgRC");
		MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/welcome");
		MvcResult mvcResult = mockMvc.perform(mockHttpServletRequestBuilder).andReturn();
		System.out.println("mvcResult:::::: "+mvcResult);
		MockHttpServletResponse mockHttpServletResponse = mvcResult.getResponse();
		int status = mockHttpServletResponse.getStatus();
		//assertEquals(200,status);
	}
	}

