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
import com.training.pom.CheckoutPOM;
import com.training.pom.HomePOM;
import com.training.pom.PreloginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class PreloginVerification {
	
	
		private WebDriver driver;
		private String baseUrl;
		private HomePOM homePOM;
		private CheckoutPOM checkoutPOM;
		private PreloginPOM preloginPOM;
		private static Properties properties;
		private ScreenShot screenShot;
		

		/*public static void main(String[] dsargs) {
			// TODO Auto-generated method stub
			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://uniformm1.upskills.in/");
		driver.findElement(By.xpath("//img[@alt='banner1']")).click();
		driver.findElement(By.xpath("//img[@title='REGULAR T-SHIRTS (Rust)']")).click();
		Select select=new Select(driver.findElement(By.id("input-option376")));
		select.selectByValue("969");
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'View Cart')]")).click();
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.id("input-email")).sendKeys("veni@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("aasu1234");
		driver.findElement(By.id("button-login")).click();
		driver.findElement(By.id("button-payment-address")).click();
		driver.findElement(By.id("button-shipping-address")).click();
		driver.findElement(By.id("button-shipping-method")).click();
		driver.findElement(By.name("comment")).sendKeys("Please Deliver between 7am to 10 am");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("button-payment-method")).click();
		driver.findElement(By.id("button-confirm")).click();
	
	}*/
		
		@BeforeClass
		public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}

		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			//registerPOM = new RegisterPOM(driver);
			//loginPOM=new LoginPOM(driver);
			homePOM=new HomePOM(driver); 
			checkoutPOM=new CheckoutPOM(driver);
			preloginPOM=new PreloginPOM(driver);
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
			homePOM.clickshopUniform();
			homePOM.clickTSHIRTS();
			homePOM.clickSize();
			homePOM.clickAddtoCart();
			checkoutPOM.Clickcart();
			checkoutPOM.clickviewcart();
			checkoutPOM.clickCheckout();
			preloginPOM.Sendemail("veni@gmail.com");
			preloginPOM.Sendpassword("aasu1234");
			preloginPOM.Clicklogin_btn();
			preloginPOM.ClickContinue1();
			preloginPOM.ClickContinue2();
			preloginPOM.SendComment("Please Deliver between 7am to 10 am");
			preloginPOM.ClickContinue3();	
			preloginPOM.SendComment2("Please Deliver between 7am to 10 am");
			preloginPOM.Clickcheckbox();
			preloginPOM.ClickContinue4();
			preloginPOM.ClickConfirm_btn();
			screenShot.captureScreenShot("Order placed");
		}
	}
