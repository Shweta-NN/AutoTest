package Seleniumpkg;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteAug 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		List<WebElement> s1 = s.getOptions();
		ArrayList<String> l=new ArrayList<String>();
		for (WebElement we : s1) 
		{
			l.add(we.getText());
		}
		if(l.contains("August"))
		{
			System.out.println("August is present");
		}
		else
		{
			System.out.println("August not is present");
		}
		l.remove("Aug");
		for (String l1 : l) 
		{
			System.out.println(l1);
		}
		driver.quit();
	}
}
