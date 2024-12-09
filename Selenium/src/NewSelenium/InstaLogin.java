package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("shweta");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
}

