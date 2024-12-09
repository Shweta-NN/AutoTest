package NewSelenium;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/HTML/checkbox.html");
		 List<WebElement> cb = driver.findElements(By.xpath("//input"));
		for (WebElement we : cb) 
		{
			we.sendKeys(Keys.SPACE);
			Thread.sleep(1000);	
			
		}
		
	}
}
