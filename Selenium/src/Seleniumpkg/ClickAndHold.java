package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.id("mainBlock"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.clickAndHold(src).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}
