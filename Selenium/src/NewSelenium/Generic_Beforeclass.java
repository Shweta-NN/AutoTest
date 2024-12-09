package NewSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Generic_Beforeclass 
{
	WebDriver driver;
	@BeforeClass
	public void beforecls() 
	{
		System.setProperty("webdriver.chrome.driver", "./sw2/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod
			public void beforemeth() throws InterruptedException
		{
		driver.findElement(By.name("username")).sendKeys("shweta_nirvani18");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("shwetae@95");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		}
	@AfterMethod
	public void aftmet() throws IOException
	{
		GenericPhoto.getPhoto(driver);
	}
		
	@AfterClass
	public void aftcls()
	{
		//driver.close();
	}
	}


