package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FacebookLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shweta");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
}
