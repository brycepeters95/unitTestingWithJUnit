package com.example.controllers;

import java.sql.Date;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletResponse;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.Details;

@RestController
public class DateController {

		@GetMapping(value= "/date")
		public String getDate() {
			Details detail = new Details();
			 DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			   LocalDateTime dateNow =LocalDateTime.now(ZoneId.of("UTC"));
			   date.format(dateNow);
			return date.format(dateNow);
		
		}
		@PostMapping(value= "/date", consumes = "application/json", produces = "application/json")
		public Details setDate(@RequestBody Details detail, HttpServletResponse response) {
		return detail;
		}
		
				
			
		
		
}
