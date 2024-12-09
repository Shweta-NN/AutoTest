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

public class KannadaTab 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement rclick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.contextClick(rclick).perform();
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(allwh);
		String v = l.get(1);
		driver.switchTo().window(v);
		
	}

}
