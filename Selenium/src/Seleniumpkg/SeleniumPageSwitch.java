package Seleniumpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPageSwitch
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele5 = driver.findElement(By.xpath("//span[text()='Blog']"));
		ArrayList<WebElement> a=new ArrayList<WebElement>();
		a.add(ele1);
		a.add(ele2);
		a.add(ele3);
		a.add(ele4);
		a.add(ele5);
		Actions act=new Actions(driver);
		Robot r= new Robot();
			
		for (WebElement l : a) 
		{
			act.contextClick(l).perform();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
		TreeSet<String> ts=new TreeSet<String>();
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> l1=new ArrayList<String>(allwh);
		String v = l1.get(3);
		for (String s : l1) 
		{
			String t1 = driver.getTitle();
			System.out.println(t1);
		}
		
		driver.switchTo().window(v);
		System.out.println(ts);
		
//		if(t.equals("Support"))
//		{
//			driver.switchTo().window(v);
//		}
		//driver.quit();
	}
}

