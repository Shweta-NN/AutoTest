package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemoApps 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		Thread.sleep(1000);
		WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement dst1 = driver.findElement(By.xpath("//div[text()='Mobile Cover']]"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src1 , dst1).perform();
		driver.quit();
		
	}
}
