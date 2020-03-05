package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
	
	private WebDriver driver;
	
	public HomePOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(className="fa-user")
	private WebElement user_icon;
	
	public void clickUserIcon() {
		this.user_icon.click();
	}
	/*@FindBy(linkText="Login")
	private WebElement Login_btn;
	
	public void clickLogin_btn() {
		this.Login_btn.click();*/
	@FindBy(partialLinkText="Register")
	private WebElement Register_btn;
	
	public void clickRegister_btn() {
		this.Register_btn.click();
	

}
}
