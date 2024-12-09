package NewSelenium;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownJSE 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
		Set<String> allwh = driver.getWindowHandles();
		
		 for (String w : allwh) 
		    {
			driver.switchTo().window(w);	
			}
		 Thread.sleep(3000);
			
		    WebElement e = driver.findElement(By.xpath("//input[@type='checkbox']"));	
		    Point p = e.getLocation();
		    int y = p.getY();
		    JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,"+y+")");
			e.click();
			driver.findElement(By.xpath("//button[.='Accept Our Policy']")).click();	
			GenericPhoto.getPhoto(driver);
		
	}

}
