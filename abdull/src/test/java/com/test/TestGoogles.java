package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogles {
	WebDriver driver;
	@Before
	public void startup(){
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	@After
	public void teardown(){
		driver.quit();
		
	}
	@Test
	public void mytest(){
		driver.get("http://www.google.com");
	}
	

}
