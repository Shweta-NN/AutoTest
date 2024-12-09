package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLoc 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML/New%20Selenium%20Btc/tagnamelocator.html");
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("a1")).click();
		//driver.findElement(By.name("n1")).click();
		driver.findElement(By.className("c1")).click();
		
	}
}
