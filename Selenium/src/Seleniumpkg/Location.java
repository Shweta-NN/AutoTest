package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.xpath("//span[.='Login']"));
		Point locn = ele.getLocation();
		int locn1 = locn.getX();
		int locn2 = locn.getY();
		System.out.println(locn);
		System.out.println(locn1);
		System.out.println(locn2);
	
	}
}
