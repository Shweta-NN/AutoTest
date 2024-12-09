package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.doubleClick(dclick).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
