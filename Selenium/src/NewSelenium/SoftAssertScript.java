package NewSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertScript 
{
	@Test
	public void soft_assert()
	{
		System.setProperty("webdriver.chrome.driver", "./sw2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, "Hello");
		System.out.println("Continue TestCase execution");
		sa.assertAll();
	}

}
