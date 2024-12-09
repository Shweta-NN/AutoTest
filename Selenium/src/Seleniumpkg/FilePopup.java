package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilePopup 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/fileuploadpopup.html");
		WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\Admin\\Desktop\\shoppersstack.txt");
		
	}
}
