package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.MultipleInvalidUsersRegister;
import com.training.generics.ScreenShot;
import com.training.pom.HomePOM;
import com.training.pom.RegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MultipleInvalidUserCredentials {
	
	private WebDriver driver;
	private String baseUrl;
	private HomePOM homePOM;
	private RegisterPOM registerPOM;
	private ScreenShot screenShot;
	private static Properties properties;



@BeforeClass
public void setupBeforeClass() throws IOException {
	properties=new Properties();
	FileInputStream instream=new FileInputStream("./resources/others.properties");
	properties.load(instream);	
}

@BeforeMethod
public void setupBeforeMethod() {
	driver=DriverFactory.getDriver(DriverNames.CHROME);
	homePOM=new HomePOM(driver);
	registerPOM=new RegisterPOM(driver);
	screenShot=new ScreenShot(driver);
	baseUrl=properties.getProperty("baseURL");
	driver.get(baseUrl);
	
}
@AfterMethod
public void setupAfterMethod() throws InterruptedException {
	Thread.sleep(1000);
	driver.quit();
}
@Test(dataProvider= "MultipleInvalidUserRegistration", dataProviderClass= MultipleInvalidUsersRegister.class)
public void MultipleInvalidUserCredentials(String FieldsName, String FirstName, String LastName, String email, String Telephone, String Address1, String
		 Address2, String City, String PostalCode, String Country, String State, String password, String passwordconfirm) {
	homePOM.clickUserIcon();
	homePOM.clickRegister_btn();
	registerPOM.sendFirstName(FirstName);
	registerPOM.sendLastname(LastName);
	registerPOM.sendemail(email);
	registerPOM.sendtelephone(Telephone);
	registerPOM.sendaddress(Address1);
	registerPOM.sendaddress2(Address2);
	registerPOM.sendcity(City);
	registerPOM.sendpostcode(PostalCode);
	registerPOM.clickCountry();
	registerPOM.clickState();
	registerPOM.sendpass(password);
	registerPOM.sendconfirm(passwordconfirm);
	registerPOM.clickNewsletter();
	registerPOM.clickagree();
	registerPOM.clickContinue();
	screenShot.captureScreenShot("FieldsName2");
	
	
}
	
}
