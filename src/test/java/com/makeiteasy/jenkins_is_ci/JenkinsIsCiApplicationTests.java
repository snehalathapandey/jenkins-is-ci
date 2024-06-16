package com.makeiteasy.jenkins_is_ci;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class JenkinsIsCiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void sanityTest() throws Exception{
       String sanity="Java Made Easy";
	   mockMvc.perform(MockMvcRequestBuilders.get("/sanity/{sample}",sanity))
			   .andExpect(MockMvcResultMatchers.status().isOk())
			   .andExpect(MockMvcResultMatchers.content().string(sanity));
	}

}
