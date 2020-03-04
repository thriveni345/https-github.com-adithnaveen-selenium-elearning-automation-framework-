package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPOM {
private WebDriver driver; 
	
	public RegisterPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstname")
	private WebElement FirstName; 
	
	@FindBy(id="input-lastname")
	private WebElement Lastname;
	
	@FindBy(name="email")
	private WebElement email; 
	
	@FindBy(id="input-telephone")
	private WebElement telephone; 
	
	@FindBy(name="address_1")
	private WebElement address; 
	
	@FindBy(id="input-city")
	private WebElement city; 
	
	@FindBy(id="input-postcode")
	private WebElement postcode ; 
	
	@FindBy(name="country_id")
	private WebElement country ; 
	
	@FindBy(id="input-zone")
	private WebElement State ; 
	
	@FindBy(id="input-password")
	private WebElement pass ; 
	
	@FindBy(id="input-confirm")
	private WebElement confirm; 
	
	@FindBy(xpath="//input[@value='0']")
	private WebElement Newsletter; 
	
	@FindBy(name="agree")
	private WebElement agree; 
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement Continue; 

	
	
	public void sendFirstName(String FirstName) {
		this.FirstName.clear();
		this.FirstName.sendKeys(FirstName);
	}
	
	public void sendLastname(String Lastname) {
		this.Lastname.clear(); 
		this.Lastname.sendKeys(Lastname); 
	}
	public void sendemail(String email) {
		this.email.clear(); 
		this.email.sendKeys(email); 
	}
	public void sendtelephone(String telephone) {
		this.telephone.clear(); 
		this.telephone.sendKeys(telephone); 
	}
	public void sendaddress(String address) {
		this.address.clear(); 
		this.address.sendKeys(address); 
	}
	public void sendcity(String city) {
		this.city.clear(); 
		this.city.sendKeys(city); 
	}
	public void sendpostcode(String postcode) {
		this.postcode.clear(); 
		this.postcode.sendKeys(postcode); 
	}
	public void clickCountry() {
		this.country.click();
		Select State=new Select(this.country);
		State.selectByVisibleText("India");
	}
	public void clickState() {
		this.State.click();
		Select State=new Select(this.State);
		State.selectByValue("1489");
	}
	
	public void sendpass(String pass) {
		this.pass.clear(); 
		this.pass.sendKeys(pass); 
	}
	public void sendconfirm(String confirm) {
		this.confirm.clear(); 
		this.confirm.sendKeys(confirm); 
	}
		
	public void clickNewsletter() {
		this.Newsletter.click(); 
	}
	public void clickagree() {
		this.agree.click(); 
	}
	public void clickContinue() {
		this.Continue.click(); 
	}
}