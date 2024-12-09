package Seleniumpkg;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachLoop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/HTML/NamesSwap.html");
		List<WebElement> names = driver.findElements(By.xpath("//input"));
		int count = names.size();
		for(WebElement n:names)
		{
			n.sendKeys("shweta");
			Thread.sleep(1000);
		}
		for (int i = count-1; i>=0; i--) 
		{
			WebElement we = names.get(i);
			Thread.sleep(1000);
			we.clear();
		}
		driver.quit();
	}
}
