package NewSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbMonthDD 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("year"));
		Select s=new Select(ele);
		List<WebElement> mon = s.getOptions();
		for (WebElement we : mon) 
		{
			System.out.println(we.getText());
		}
//		System.out.println(mon.size());
	}
}
