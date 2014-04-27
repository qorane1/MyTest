package com.unittests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.systemtest.page.LoginPage;
   
public class LoginTest {
	private static final String BASE_URL = "https://netmail.shere.com/owa/";
	private static final String USERNAME= "abdullahi.hussein";
	private static final String PASSWORD = "ardo123";
	
	private WebDriver driver;
	private WebDriverWait wait;
	private LoginPage loginPage;
	
	@Before
	public void setup(){
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 5);
		driver.get(BASE_URL);
		loginPage = PageFactory.initElements(driver,LoginPage.class);
		
	}
	@Test
	public void testLogin(){
		loginPage.login(USERNAME, PASSWORD);
		/*loginPage.getUSERNAME();
		Assert.assertEquals(MAC, loginPage.getUSERNAME());*/
	}
	@After
	public void tearDown(){
		driver.quit();
	}
	
	

}
