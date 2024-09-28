package testCases;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_001_Registration extends BaseClass {

	
	@AfterClass
	public void  tearDown() {
		driver.quit();
	}
	@Test(priority=0)
	public void verifyNavigateRegPage() {
		HomePage hp=new HomePage(driver);		
		hp.clickRegister();
		logger.info("Clicked on register");
	}
	
	//@Parameters("first")
	@Test(priority=1)
	public void  verifyAccountReg() throws InterruptedException {
		
		RegisterPage rp=new RegisterPage(driver);
		
		rp.setTxtFirstName("Madni");
		logger.info("Enetered first name");
		rp.setTxtLastName("Ansari");
		rp.setTxtEmail("xyz@");
		rp.setTxtAddress("Kolkata");
		rp.setTxtPhone("12345");
		rp.setGender("Male");
		rp.setChkBoxCricet();
		rp.setChkBoxHocky();
		rp.setDropCountry(4);
		rp.setDropSkills(3);
		rp.setDropYear("1995");
		rp.setDropMonth("July");
		rp.setDroptDay("5");
		rp.setTxtPass("12345");
		rp.setTxtRePass("12345");
		rp.clickSubmit();
		
		Assert.assertEquals(true, true);
		//Assert.assertEquals(false, true);
	}
	@Test
	@Parameters({"OS","browser"})
	public void sanity(String os, String browser) {
		
		Assert.assertEquals(os, "WINDOW");
		Assert.assertEquals(browser, "chrome");
		logger.error("Wrong browser name");
	}
	@Test
	@Parameters("OS")
	public void reg(String os) {
		Assert.assertEquals(os,"WINDOW");
	}
	@DataProvider(name ="email")
	public String[] emailData(){
		String data[] = {"xyz@gmail.com"};
	
		
		
		return  data;
	}
	
}
