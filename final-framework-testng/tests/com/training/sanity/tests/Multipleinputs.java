package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.ForgotPOM;
import com.training.pom.HomePOM;
import com.training.pom.LoginPOM;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Multipleinputs {
	private WebDriver driver;
	private String baseUrl;
	private HomePOM homePOM;
	private LoginPOM loginPOM;
	//private ForgotPOM forgotPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM=new LoginPOM(driver);
		homePOM=new HomePOM(driver); 
		//forgotPOM=new ForgotPOM(driver);
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
	
	@Test(dataProvider = "Multiple-inputs", dataProviderClass = LoginDataProviders.class)
	public void validLoginTest(String FieldsName, String EMail, String Password) {
		homePOM.clickUserIcon();
		homePOM.clickLogin_btn();		
		loginPOM.sendUserName(EMail);
		loginPOM.sendPassword(Password);
		screenShot.captureScreenShot("FieldsName");
		
		
	}
}




