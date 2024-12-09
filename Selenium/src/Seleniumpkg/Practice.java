package Seleniumpkg;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
//		Dimension d=new Dimension(300,500);
//		driver.manage().window().setSize(d);
		
		Point p=new Point(300,200);
		driver.manage().window().setPosition(p);
		
	}
}
