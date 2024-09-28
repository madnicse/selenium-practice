package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	WebElement txtAddress= driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
	WebElement txtPhone = driver.findElement(By.xpath("//input[@type='tel']"));
	WebElement radioFeMale = driver.findElement(By.xpath("//input[@value='FeMale']"));
	WebElement radioMale = driver.findElement(By.xpath("//input[@value='Male']"));
	
	WebElement chkBoxCricet = driver.findElement(By.xpath("//input[@id='checkbox1']"));
	WebElement chkBoxMovies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
	WebElement chkBoxHocky = driver.findElement(By.xpath("//input[@id='checkbox3']"));
	
	WebElement dropSkills = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
	WebElement dropCountry = driver.findElement(By.xpath("//select[@id='country']"));
	WebElement dropYear = driver.findElement(By.xpath("//select[@ng-model='yearbox']"));
	WebElement dropMonth = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
	WebElement droptDay = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
	
	WebElement txtPass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
	WebElement txtRePass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
	WebElement submit=driver.findElement(By.xpath("//button[@id='submitbtn']"));
	
	public void setTxtFirstName(String firstName) {
		this.txtFirstName.sendKeys(firstName);
	}
	public void setTxtLastName(String lastName) {
		this.txtLastName.sendKeys(lastName);
	}
	public void setTxtAddress(String txtAddress) {
		this.txtAddress.sendKeys(txtAddress);;
	}
	public void setTxtEmail(String txtEmail) {
		this.txtEmail.sendKeys(txtEmail);
	}
	public void setTxtPhone(String txtPhone) {
		this.txtPhone.sendKeys(txtPhone);
	}
	public void setGender(String gender) {
		if(gender.equals("Male")) {
			
			if(radioMale.isSelected()==false)
			this.radioMale.click();
		}
		else {
			this.radioFeMale.click();
		}
		
	}
	
	public void setChkBoxCricet() {
		if(chkBoxCricet.isSelected()==false) {
			this.chkBoxCricet.click();
		}
		
	}
	public void setChkBoxMovies(){
		if(chkBoxMovies.isSelected()==false) {
			this.chkBoxMovies.click();
		}
	}
	public void setChkBoxHocky() {
		if(chkBoxHocky.isSelected()==false) {
			this.chkBoxHocky.click();
		}
	}
	public void setDropSkills(int index) {
		Select skils=new Select(this.dropSkills);
		skils.selectByIndex(index);
	}
	public void setDropCountry(int index) {
		Select countries=new Select(this.dropCountry);
		countries.selectByIndex(index);
	}
	public void setDropYear(String year) {
		Select years=new Select(this.dropYear);
		years.selectByValue(year);
	}
	public void setDropMonth(String month) {
		Select months=new Select(this.dropMonth);
		months.selectByValue(month);
	}
	public void setDroptDay(String day) {
		Select days=new Select(this.droptDay);
		days.selectByValue(day);
	}
	public void setTxtPass(String txtPass) {
		this.txtPass.sendKeys(txtPass);
	}
	public void setTxtRePass(String txtRePass) {
		this.txtRePass.sendKeys(txtRePass);
	}
	public void setFirstName(String name) {
	 
	}
	public void clickSubmit() {
		this.submit.click();
	}
}
