package Seleniumpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyNowDiffTab 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("SAMSUNG Galaxy Z Fold");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy Z Fold6 5G (Silver Shadow, 256 GB)']")).click();
		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_TAB);
//		driver.findElement(By.xpath("//button[@type='button']")).click();
	}
}
