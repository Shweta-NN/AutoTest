package Seleniumpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.contextClick(rclick).perform();
		Thread.sleep(1000);
		rclick.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();
		
	}
}
