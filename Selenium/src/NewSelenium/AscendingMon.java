package NewSelenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AscendingMon
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
//		ArrayList<String> l= new ArrayList<String>();
//		List<WebElement> opt = s.getOptions();
//		for (WebElement we : opt) 
//		{
//			String text = we.getText();
//			l.add(text);
//		}
//		Collections.sort(l);
//		Collections.reverse(l);
//		for (String l1:l) 
//		{
//			System.out.println(l1);
//		}
		
		TreeSet<String> t=new TreeSet<String>(Collections.reverseOrder());
		List<WebElement> opt = s.getOptions();
		for (WebElement we : opt) 
		{
			String st1 = we.getText();
			t.add(st1);
		}
		
		for (String t1 : t) 
		{
			System.out.println(t1);
		}
	}
}
