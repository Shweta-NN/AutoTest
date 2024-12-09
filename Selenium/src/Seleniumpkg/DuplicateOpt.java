package Seleniumpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateOpt 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/HTML/Dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("Empire"));
		Select s=new Select(ele);
		List<WebElement> opt1 = s.getOptions();	
		TreeSet<String> t=new TreeSet<String>();
		for (WebElement we : opt1) 
		{
			String s1=we.getText();
			t.add(s1);
		}
		
		for (String s2 : t)
		{
			System.out.println(s2);
		}
	
		driver.quit();
		
	}

}

