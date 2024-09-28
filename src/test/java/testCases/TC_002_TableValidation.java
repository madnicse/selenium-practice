package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC_002_TableValidation extends BaseClass {
	
	@Test
	public void tableValidation() {
		
//		driver.get("https://practice.expandtesting.com/dynamic-table");
//		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
//		
//		int rowsCount = rows.size();
//		int columnCount = driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size();
//		
//		for(int i=1;i<=rowsCount;i++) {
//			System.out.print("------START----------"+ i);
//			for(int j=1;j<=columnCount;j++) {
//				System.out.println(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText());
//			}
//		}
//		
//		/*for(WebElement row:rows) {
//			
//			WebElement firstColumn = row.findElement(By.xpath("//table/tbody/tr["+Rowindex+"]/td[1]"));
//			System.out.println(firstColumn.getText());
//			WebElement secondColumn = row.findElement(By.xpath("//table/tbody/tr["+Rowindex+"]/td[2]"));
//			System.out.println(secondColumn.getText());
//			WebElement thirdColumn = row.findElement(By.xpath("//table/tbody/tr["+Rowindex+"]/td[3]"));
//			System.out.println(thirdColumn.getText());
//			WebElement fourtColumn = row.findElement(By.xpath("//table/tbody/tr["+Rowindex+"]/td[4]"));
//			System.out.println(fourtColumn.getText());
//			WebElement fiftColumn = row.findElement(By.xpath("//table/tbody/tr["+Rowindex+"]/td[5]"));
//			System.out.println(fiftColumn.getText());
//			System.out.println("--------END----------"+Rowindex+"-----END---------");
//			Rowindex++;
//		}*/
//		//2nd approach
//		
	}
}


