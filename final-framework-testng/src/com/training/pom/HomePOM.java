package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOM {
	
	private WebDriver driver;
	
	public HomePOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	/*@FindBy(xpath="//img[@alt='banner1']")
	private WebElement shopUniform;
	
	public void clickshopUniform() {
		this.shopUniform.click();
	}
	@FindBy(xpath="//img[@title='REGULAR T-SHIRTS (Rust)']")
	private WebElement TSHIRTS;
	
	public void clickTSHIRTS() {
		this.TSHIRTS.click();
	}
	@FindBy(id="input-option376")
	private WebElement Size;
	
	public void clickSize() {
		Select select=new Select(this.Size);
		select.selectByValue("970");
	}
	@FindBy(id="button-cart")
	private WebElement AddtoCart;
	
	public void clickAddtoCart() {
		this.AddtoCart.click();
	}*/
	@FindBy(className="fa-user")
	private WebElement user_icon;
	
	public void clickUserIcon() {
		this.user_icon.click();
	}
	/*@FindBy(linkText="Login")
	private WebElement Login_btn;
	
	public void clickLogin_btn() {
		this.Login_btn.click();
	}*/
	
		@FindBy(partialLinkText="Register")
	private WebElement Register_btn;
	
	public void clickRegister_btn() {
		this.Register_btn.click();
	

}
}

