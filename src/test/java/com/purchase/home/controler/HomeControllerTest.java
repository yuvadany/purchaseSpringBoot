package com.purchase.home.controler;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.purchase.home.model.Items;
import com.purchase.home.service.HomeService;

@WebMvcTest(HomeController.class)
@ExtendWith(SpringExtension.class)
public class HomeControllerTest {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private HomeService homeService;

	@Test
	private void welcomeTest() throws Exception {
		mockMvc.perform(get("/v1/purchase")).andExpect(status().is(200))
				.andExpect(MockMvcResultMatchers.content().string("Welcome..."));
	}

	@Test
	private void getAllTest() throws Exception {
		Mockito.when(homeService.getAllItems())
				.thenReturn(Arrays.asList(new Items(1, "pant", "done", 1), new Items(2, "shirt", "pending", 2)));
		mockMvc.perform(get("/v1/purchase/all")).andExpect(status().is(200))
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.size()", Matchers.is(2))).andExpect(jsonPath("$[0].item", Matchers.is("pant")));
	}
}
