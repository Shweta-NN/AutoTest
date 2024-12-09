package NewSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameClear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/HTML/NamesSwap.html");
		List<WebElement> names = driver.findElements(By.xpath("//input"));
		int count = names.size();
		
		for (int i = 0; i < count; i++) 
		{
			WebElement n1 = names.get(i);
			Thread.sleep(1000);
			n1.sendKeys("shweta");
		}
		for (int j = count-1; j >= 0; j--) 
		{
			 WebElement n2 = names.get(j);
			 Thread.sleep(1000);
			 n2.clear();
			
		}
	}
}
