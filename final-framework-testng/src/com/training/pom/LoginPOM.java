package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	private WebElement userName; 
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	/*@FindBy(linkText="Forgotten Password")
	private WebElement Forgotten_link;
	public void clickForgotten_link() {
		this.Forgotten_link.click();
	}*/
	
	@FindBy(id="input-password")
	private WebElement password;
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBtn; 

	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}

	
	
