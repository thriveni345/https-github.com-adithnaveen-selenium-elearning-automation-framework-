package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreloginPOM {
private WebDriver driver; 
	
	public PreloginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement email; 
	
	public void Sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	@FindBy(id="input-password")
	private WebElement pass; 
	
	public void Sendpassword(String pass) {
		this.pass.clear();
		this.pass.sendKeys(pass);
	}
	@FindBy(id="button-login")
	private WebElement login; 
	
	public void Clicklogin_btn() {
		this.login.click();
	}
	@FindBy(id="button-payment-address")
	private WebElement Continue1; 
	
	public void ClickContinue1() {
		this.Continue1.click();
	}
	@FindBy(id="button-shipping-address")
	private WebElement Continue2; 
	
	public void ClickContinue2() {
		this.Continue2.click();
	}
	@FindBy(xpath="//div[@id='collapse-shipping-method']//textarea[@name='comment']")
	private WebElement Comment; 
	
	public void SendComment(String Comment) {
		this.Comment.sendKeys(Comment);
	}
	@FindBy(id="button-shipping-method")
	private WebElement Continue3; 
	
	public void ClickContinue3() {
		this.Continue3.click();
	}
	@FindBy(xpath="//div[@id='collapse-payment-method']//textarea[@name='comment']")
	private WebElement Comment2; 
	
	public void SendComment2(String Comment) {
		this.Comment2.sendKeys(Comment);
	}
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement checkbox; 
	
	public void Clickcheckbox() {
		this.checkbox.click();
	}
	@FindBy(id="button-payment-method")
	private WebElement Continue4; 
	
	public void ClickContinue4() {
		this.Continue4.click();
	}
	@FindBy(xpath="//input[@value='Confirm Order']")
	private WebElement Confirm; 
	
	public void ClickConfirm_btn() {
		this.Confirm.click();
	}	
}
