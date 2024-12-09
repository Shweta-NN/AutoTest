package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NamesSwap 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/HTML/NamesSwap.html");
	    driver.findElement(By.id("a1")).sendKeys("shweta");
		driver.findElement(By.id("a2")).sendKeys("arpitha");
		driver.findElement(By.id("a3")).sendKeys("shweta");
		driver.findElement(By.id("a2")).sendKeys("arpitha");
		
		
	}
}
