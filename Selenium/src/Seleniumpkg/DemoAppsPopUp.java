package Seleniumpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsPopUp 
{
	//Confirm Box
	public static void confirm() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(1000);
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		driver.quit();
	}
	//buttonAlert1
	public static void prompt() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.findElement(By.id("buttonAlert1")).sendKeys("yes");
		Thread.sleep(1000);
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException
	{
		confirm();
		//prompt();
	}	
}
