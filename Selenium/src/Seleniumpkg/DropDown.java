package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML/Dropdown.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("Empire"));
		Select s=new Select(ele);
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("a");
		Thread.sleep(1000);
		s.selectByVisibleText("Biryani");
		Thread.sleep(1000);
		s.deselectAll();
		driver.quit();
	}
}
