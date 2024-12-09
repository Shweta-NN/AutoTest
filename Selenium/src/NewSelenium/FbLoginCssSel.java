package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginCssSel 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("shweta");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("shweta1234");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
	}
}
