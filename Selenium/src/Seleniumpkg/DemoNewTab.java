package Seleniumpkg;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNewTab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Open in new window']")).click();
		Thread.sleep(1000);
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> l1=new ArrayList<String>(allwh);
		String v = l1.get(1);
		driver.switchTo().window(v);
		//driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	}
}
