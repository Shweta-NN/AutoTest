package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMultiple 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement dst = driver.findElement(By.id("dropZone2"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);		
	
	}
}
