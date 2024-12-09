package Seleniumpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOpt 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML/Dropdown.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("Empire"));
		Select s=new Select(ele);
		List<WebElement> opt1 = s.getOptions();	
		for (WebElement we : opt1) 
		{
			String s1 = we.getText();
			System.out.println(s1);
		}
	
		driver.quit();
		
	}
}
