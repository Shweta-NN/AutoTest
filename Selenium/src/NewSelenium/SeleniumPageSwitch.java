package NewSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

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
		WebElement ele1 = driver.findElement(By.xpath("//span[.='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[.='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[.='Support']"));
		WebElement ele5 = driver.findElement(By.xpath("//span[.='Blog']"));
		ArrayList<WebElement> l=new ArrayList<WebElement>();
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		l.add(ele4);
		l.add(ele5);
		
		Actions act = new Actions(driver);
		Robot r=new Robot();
		
		for(WebElement a:l)
		{
			act.contextClick(a).perform();
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
		
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> l1=new ArrayList<String>(allwh);
		String ind = l1.get(0);
		System.out.println(ind);
		for (String wh : allwh) 
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());	
		}
	}

}
