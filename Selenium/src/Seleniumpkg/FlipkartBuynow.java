package Seleniumpkg;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipkartBuynow
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Samsung z fold 7");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy Z Fold6 5G (Silver Shadow, 256 GB)']")).click();
		driver.findElement(By.xpath("//button[@type='button']"));
		String p_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>(allwh);
		String v = a.get(1);
		driver.switchTo().window(v);
		WebElement ele = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G FMWyoY']"));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ele.getScreenshotAs(OutputType.FILE);
		File dst=new File("E:\\Selenium\\Scripts\\scrn1.jpeg");
		FileHandler.copy(src, dst);
		
	}
}
