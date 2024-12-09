package runnerscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjmodel.PomScript;

public class Demo 
{
	@Test
	public void validdata() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./sw2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		PomScript p = new PomScript(driver);
		p.passData();
		Thread.sleep(1000);
		driver.navigate().refresh();
		p.passData();
	}

}
