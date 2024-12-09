package NewSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox 
{
	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/HTML/10checkbox.html");
		List<WebElement> cb = driver.findElements(By.xpath("//input"));
		int count = cb.size();
		System.out.println(count);
//		for (int i = 0; i < count; i++) 
//		{
//			WebElement we = cb.get(i);
//			we.click();			
//		}
//		for (int j = count-1; j >=0; j--) 
//		{
//			WebElement we1 = cb.get(j);
//			we1.click();
//		}
		//For each loop
		for(WebElement we:cb)
		{
			we.click();
		}
			
		
	}
	
}
