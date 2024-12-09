package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlideBar 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.xpath("//input[@type='range']"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.dragAndDropBy(src, 50, 0).perform();
		Thread.sleep(1000);
		driver.quit();
	}
}
