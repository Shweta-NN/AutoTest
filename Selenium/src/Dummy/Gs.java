package Dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gs
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}
	
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	
}
