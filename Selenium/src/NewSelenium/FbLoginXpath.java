package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginXpath
{
	public static void main(String[] args) throws InterruptedException 
	{

//		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shweta");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("shweta1234");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shweta");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("!2342345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}
}
