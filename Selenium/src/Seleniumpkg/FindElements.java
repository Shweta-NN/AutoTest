package Seleniumpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
//		driver.get("https://www.flipkart.com/");
//		List<WebElement> links = driver.findElements(By.xpath("//img|//a"));
		int count=links.size();
		System.out.println(count);
		
		driver.quit();
	}
}
