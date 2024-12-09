package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStackxpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/713D1eLsaqL._SX679_.jpg']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='buy now")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kavyasingh@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("kavyasingh@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		//driver.quit();
	}
}
