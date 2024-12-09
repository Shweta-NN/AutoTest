package NewSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericAnnotation 
{
	WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		
		System.setProperty("webdriver.chrome.driver", "./sw2/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
				
		
		
	}
	
	@AfterMethod
	public void closeapp() throws IOException
	{
		GenericPhoto.getPhoto(driver);
		driver.close();
	}

}
