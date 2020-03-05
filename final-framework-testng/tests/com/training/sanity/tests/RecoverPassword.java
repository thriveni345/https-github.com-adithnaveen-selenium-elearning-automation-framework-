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
import com.training.pom.ForgotPOM;
import com.training.pom.HomePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RecoverPassword {
	
	private WebDriver driver;
	private String baseUrl;
	private HomePOM homePOM;
	private LoginPOM loginPOM;
	private ForgotPOM forgotPOM;
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
		loginPOM=new LoginPOM(driver);
		homePOM=new HomePOM(driver); 
		forgotPOM=new ForgotPOM(driver);
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
	public void validLoginTest() {
		homePOM.clickUserIcon();
		homePOM.clickLogin_btn();
		loginPOM.sendUserName("veni@gmail.com");
		loginPOM.clickForgotten_link();
		forgotPOM.sendUserName("veni@gmail.com");
		forgotPOM.clickcontinue();
		screenShot.captureScreenShot("First");
	
		
	}
}



