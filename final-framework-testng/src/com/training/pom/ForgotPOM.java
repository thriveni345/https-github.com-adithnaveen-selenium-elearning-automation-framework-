package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPOM {
private WebDriver driver; 
	
	public ForgotPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-email")
	private WebElement EMAIL;
	
	public void sendUserName(String EMAIL) {
		this.EMAIL.clear();
		this.EMAIL.sendKeys(EMAIL);
	}
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement Continue;
	
	public void clickcontinue() {
		this.Continue.click();
	}
	
}
