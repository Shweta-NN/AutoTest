package NewSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericAnnotation_gen 
{
	WebDriver driver;
	@BeforeMethod
	public String openapp(String key,String value,String url)
	{
		String keyval = System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return keyval;
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
