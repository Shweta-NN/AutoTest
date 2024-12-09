package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFilePopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&.done=https%3A%2F%2Fwww.yahoo.com%2F&pspid=2023538075&activity=ybar-signin");
		driver.manage().window().maximize();
//		driver.findElement(By.name("username")).sendKeys("snnmrh@yahoo.com");
//		Thread.sleep(1000);
//		driver.findElement(By.id("login-signin")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.className("recaptcha-checkbox-border")).click();
		
		
		driver.findElement(By.name("tpaProvider")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("identifierId")).sendKeys("1234");
		
		
	}

}
