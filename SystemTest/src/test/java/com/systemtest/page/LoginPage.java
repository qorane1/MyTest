package com.systemtest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import fsg.wrap.systemtest.SystemTestPage;

public class LoginPage extends SystemTestPage {
	
	
	@FindBy(css = "input[id=username]")
	@CacheLookup
	public WebElement  USERNAME;
	@FindBy(css = "input[id=password]")
	@CacheLookup
	public WebElement PASSWORD;
	@FindBy(css = "input[id=SubmitCreds]")
	@CacheLookup
	public WebElement SUBMITBUTTON;
	
	public LoginPage(WebDriver driver){
		//super(driver);
	}
	
	public void login(String username, String password){
		USERNAME.sendKeys(username);
		PASSWORD.sendKeys(password);
		SUBMITBUTTON.click();
		
	}
	/*public String getUSERNAME(String usernamr){
		WebElement element = driver.findElement(By.xpath("//td[1]/div"));
		return element.getText();
	}*/
}
