package Seleniumpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox10 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/HTML/10checkbox.html");
		List<WebElement> links = driver.findElements(By.xpath("(//input)[position() mod 2=0]"));
		
		for(WebElement we:links)
		{
			Thread.sleep(1000);
			we.click();
		}
	
		driver.quit();
	}
}
