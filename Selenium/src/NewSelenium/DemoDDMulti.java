package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDDMulti 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.id("select-multiple-native"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByVisibleText("Formal Shoes");
		Thread.sleep(1000);
		s.selectByValue("Leather Jacket");
		Thread.sleep(1000);
		driver.quit();
		
	}
}
