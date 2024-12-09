package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHold
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement clickhold = driver.findElement(By.id("circle"));
		Actions act=new Actions(driver);
		act.clickAndHold(clickhold).perform();
		Thread.sleep(1000);
		driver.quit();
	}
}
