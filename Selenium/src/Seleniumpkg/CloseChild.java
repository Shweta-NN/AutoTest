package Seleniumpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChild 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		String c_id = driver.getWindowHandle();
		Thread.sleep(1000);
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		for (String wh : allwh) 
		{
			driver.switchTo().window(wh);
			System.out.println(c_id);
			if(wh.equals(c_id))
			{
				driver.close();
			}
		}
	}
}
