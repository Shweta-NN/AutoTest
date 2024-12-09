package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://facebook.com");
		WebElement usn=driver.findElement(By.id("email"));
		
		boolean r = usn.isDisplayed();
		System.out.println(r);
		
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean r1 = btn.isEnabled();
		System.out.println(r1);
		
		
		boolean r2 = usn.isSelected();
		System.out.println(r2);
		
		//location
		Point locn = usn.getLocation();
		System.out.println(locn);
		
		 //size
		int height = usn.getSize().getHeight();
		System.out.println(height);
		
		//tagname
		String t1 = usn.getTagName();
		System.out.println(t1);
		
//		driver.get("C:\\Users\\Admin\\Desktop\\HTML\\WebElement.html");
//		WebElement usn=driver.findElement(By.id("usn"));
//		boolean res2 = usn.isSelected();
//		System.out.println(res2);
//		driver.quit();
		
		//btn.sendKeys(Keys.ENTER);
		
		String res = btn.getAttribute("data-testid");
		System.out.println(res);
		
		//point
		Point p=new Point(300,200);
		driver.manage().window().setPosition(p);
		
		
		driver.quit();
		
		
		
		
	}
}
