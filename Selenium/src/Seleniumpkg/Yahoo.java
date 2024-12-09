package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&.done=https%3A%2F%2Fwww.yahoo.com%2F&pspid=2023538075&activity=ybar-signin");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(args);	
		driver.findElement(By.xpath("//input[@type='submit']"));
	}
}
