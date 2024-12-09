package Seleniumpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenshot 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.name("login"));
		File src = ele.getScreenshotAs(OutputType.FILE);
		//Step3
		File dst=new File("E:\\Selenium\\Scripts\\scrn1.jpeg");
		//Step4
		FileHandler.copy(src, dst);
		driver.quit();
	}
}
