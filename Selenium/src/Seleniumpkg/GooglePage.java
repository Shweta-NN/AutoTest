package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GooglePage 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement rclick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		act.contextClick(rclick).perform();	
		
		driver.quit();
	}
}
