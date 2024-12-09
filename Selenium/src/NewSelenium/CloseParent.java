package NewSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParent {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.findElement(By.name("NewWindow")).click();
		String p_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) 
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(title.equals(p_id))
				driver.close();
		}

	}

}
