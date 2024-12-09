package NewSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnebyOne {
	//fetch title and close tabs one by one
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) 
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			driver.close();
		}

	}

}
