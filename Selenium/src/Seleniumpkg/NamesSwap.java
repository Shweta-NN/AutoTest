package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NamesSwap 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/HTML/NamesSwap.html");
		
		WebElement ele=driver.findElement(By.id("a1"));
		Thread.sleep(1000);
		ele.sendKeys(Keys.CONTROL+"ax");
		WebElement ele1=driver.findElement(By.id("a3"));
		ele1.sendKeys(Keys.CONTROL+"v");
		
		WebElement ele2=driver.findElement(By.id("a2"));
		Thread.sleep(1000);
		ele2.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(1000);
		ele.sendKeys(Keys.CONTROL+"v");
	
		
		ele1.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(1000);
		Thread.sleep(1000);
		ele2.sendKeys(Keys.CONTROL+"v");
		
		
		
	}
}
