package runnerscript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjmodel.Flikart;

public class Flip_kart 
{
	@Test
	public void buynow() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./sw2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mobiles/pr?sid=tyy,4io&otracker=categorytree");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Flikart f = new Flikart(driver);
		f.mobclick();
		Thread.sleep(1000);
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh.size());
		allwh.remove(driver.getWindowHandle());
		System.out.println(allwh.size());
		for (String s1 : allwh) 
		{
			driver.switchTo().window(s1);
			
		}
		Thread.sleep(3000);
		f.buyclick();
		Thread.sleep(3000);
		driver.quit();
	}
}
