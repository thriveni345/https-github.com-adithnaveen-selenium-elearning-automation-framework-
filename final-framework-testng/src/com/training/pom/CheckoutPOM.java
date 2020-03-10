package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPOM {
	
private WebDriver driver;
	
	public CheckoutPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement cart;
	
	public void Clickcart(){
		this.cart.click();
	}
	@FindBy(xpath="//strong[contains(text(),'View Cart')]")
	private WebElement viewcart;
	
	public void clickviewcart() {
		this.viewcart.click();
	}
	@FindBy(linkText="Checkout")
	private WebElement Checkout;
	
	public void clickCheckout() {
		this.Checkout.click();
	}
}
	
