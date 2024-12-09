package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Shweta");
		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btn']")).click();
//		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[.='Contact Us']")).click();
		
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='attended1']")).click();
		
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='domain2']")).click();
	}
}
