package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	WebElement btnSignup=driver.findElement(By.xpath("//button[@id='btn2']"));
	//WebElement linkRegister = driver.findElement(By.xpath("//a[text()='Register']"));
	
	
	public void clickRegister() {
		this.btnSignup.click();
	}
}
