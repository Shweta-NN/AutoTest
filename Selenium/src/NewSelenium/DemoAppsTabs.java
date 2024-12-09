package NewSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsTabs {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
		Set<String> allwh = driver.getWindowHandles();
		String p = driver.getWindowHandle();
		allwh.remove(p);
		for (String wh : allwh)
		{
			driver.switchTo().window(wh);
		}
		driver.findElement(By.xpath("//span[.='I have read all the terms and conditions']"));
	}

}
