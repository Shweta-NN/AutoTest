package Seleniumpkg;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlternateDropdown
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
		ArrayList<String> l=new ArrayList<String>();
		for (WebElement we : opt1) 
		{
			String s1 = we.getText();
			l.add(s1);
			
		}
		for (int i = 0; i <= l.size()-1; i=i+2) 
		{
			System.out.println(l.get(i));
		}
	
		driver.quit();
		
		
	}
}
