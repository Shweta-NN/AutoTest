package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shwetanirvani18@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("shweta18");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
	}
}
