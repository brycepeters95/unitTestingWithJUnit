package com.example.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.controllers.DateController;
import com.example.controllers.DemoApplication;
import com.sun.research.ws.wadl.Application;

@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Autowired
	private DateController dateController;
	
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(dateController).isNotNull();
	}
	@Test
	public void testGetUTCTime () throws Exception{
		assertThat(dateController.getDate()).isEqualTo(LocalDateTime.now());
	}

}
