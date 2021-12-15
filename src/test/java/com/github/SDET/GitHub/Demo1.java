package com.github.SDET.GitHub;

import org.testng.annotations.Test;

public class Demo1 {
	@Test
	
	
	public void readDataTest()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);

}}
