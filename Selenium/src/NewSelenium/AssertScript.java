package NewSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertScript
{
	@Test
	public void assert1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./sw2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		System.out.println("Test case is pass");
		Thread.sleep(1000);
		driver.quit();
	}

}
