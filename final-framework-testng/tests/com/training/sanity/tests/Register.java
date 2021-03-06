package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePOM;
import com.training.pom.RegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Register {

	private WebDriver driver;
	private String baseUrl;
	private HomePOM homePOM;
	private RegisterPOM registerPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		registerPOM = new RegisterPOM(driver);
		homePOM=new HomePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validRegisterTest() {
		homePOM.clickUserIcon();
		homePOM.clickRegister_btn();
		registerPOM.sendFirstName("thri");
		registerPOM.sendLastname("veni");
		registerPOM.sendemail("thriveni@gmail.com");
		registerPOM.sendtelephone("9678766555");
		registerPOM.sendaddress("Electronic city");
		registerPOM.sendcity("Bangalore");
		registerPOM.sendpostcode("560100");
		registerPOM.clickCountry();
		registerPOM.clickState();
		registerPOM.sendpass("aasu12345");
		registerPOM.sendconfirm("aasu12345");
		registerPOM.clickNewsletter();
		registerPOM.clickagree();
		registerPOM.clickContinue();
		screenShot.captureScreenShot("First");
}
}
