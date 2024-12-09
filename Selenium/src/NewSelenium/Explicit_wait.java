package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./sw2/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
//		WebElement ele = driver.findElement(By.id("email"));
//		wait.until(ExpectedConditions.visibilityOf(ele));
//		ele.sendKeys("shweta");
		
		wait.until(ExpectedConditions.urlContains(":hii"));
		driver.findElement(By.id("email")).sendKeys("shwe");
		
		
	}

}
