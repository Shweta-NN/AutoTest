package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown//multiple
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/HTML/Dropdown.html");
		WebElement ele = driver.findElement(By.id("Empire"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("c");
		Thread.sleep(1000);
		s.selectByVisibleText("Sandwich");
		Thread.sleep(1000);
		s.deselectAll();
		System.out.println(s.isMultiple());
		driver.quit();
	}
	
}
