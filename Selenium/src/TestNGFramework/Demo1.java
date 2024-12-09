package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1
{
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shweta");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@Test
	public void test2()
	{
		Reporter.log("Hello India",true);
	}
	
}
