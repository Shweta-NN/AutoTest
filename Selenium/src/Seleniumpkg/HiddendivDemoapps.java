package Seleniumpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddendivDemoapps
{
	public static void main(String[] args) 
	{
		////input[@type='text']
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.partialLinkText(null)).click();
		driver.findElement(By.xpath("//span[text()='19']")).click();
	}
}
