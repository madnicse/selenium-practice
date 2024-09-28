package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	@Parameters({"browser","OS"})
	@BeforeTest
	public void  setup(String browser,String os) throws InterruptedException, IOException {
		
		//Loading configure file
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);	
		//loggers
		logger = LogManager.getLogger(this.getClass());
		String url = p.getProperty("appURL");
		String runType = p.getProperty("runType");
		if(runType.equalsIgnoreCase("local")) {
			
			switch(browser) {
				case "chrome":
					driver=new ChromeDriver();
					break;
				case "firefox":
					driver=new FirefoxDriver();
					
					break;
				case "edge":
					driver= new EdgeDriver();
					break;
				 default:
						return;
			
				
			}
			
		}
		else if(runType.equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilities=new DesiredCapabilities();
			
			switch(os) {
			case("WINDOW"):
				capabilities.setPlatform(Platform.WIN10);
				break;
				
			case("MAC"):
				capabilities.setPlatform(Platform.MAC);
				break;
			case("LINUX"):
				capabilities.setPlatform(Platform.LINUX);
				break;
			 default:
				return;
			}
			
			switch(browser) {
				case  "chrome":
					capabilities.setBrowserName("chrome");
					break;
				case  "firefox":
					capabilities.setBrowserName("firefox");
					break;
				case "edge":
					capabilities.setBrowserName("MicrosoftEdge");
					break;
				 default:
						return;
			
			}
			driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get(url);
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}

}
