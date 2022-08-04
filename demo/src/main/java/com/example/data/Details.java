package com.example.data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Details {
	private String currentdate;


	public String getDate() {
		  
		   return currentdate;
		}
	
	public void setDate(String date) {
		System.out.println(date);
		this.currentdate = date;
	}
}
