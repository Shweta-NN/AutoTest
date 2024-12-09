package NewSelenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAppsync 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(allwh);
		for (String sync : l) 
		{
			driver.switchTo().window(sync);
			System.out.println(driver.getTitle());
		}
		
	}

}
