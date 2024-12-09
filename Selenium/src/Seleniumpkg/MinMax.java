package Seleniumpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinMax 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Robot r=new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
}
