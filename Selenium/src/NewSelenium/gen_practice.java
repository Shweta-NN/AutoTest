package NewSelenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class gen_practice  
{
	//Instagram login
	@Test
	public void appopen() throws InterruptedException
	{
		GenericAnnotation_gen g= new GenericAnnotation_gen();
		g.openapp("webdriver.chrome.driver", "./sw2/chromedriver.exe",
				"https://www.instagram.com/");
		g.driver.findElement(By.name("username")).sendKeys("shweta");
		Thread.sleep(1000);
		g.driver.findElement(By.name("password")).sendKeys("Password@123");
		Thread.sleep(1000);
		g.driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		g.close();
	}	
	//facebook login
		@Test
		public void fblogin() throws InterruptedException
		{
			GenericAnnotation_gen g= new GenericAnnotation_gen();
			g.openapp("webdriver.chrome.driver", "./sw2/chromedriver.exe",
					"https://www.facebook.com/");
			g.driver.findElement(By.id("email")).sendKeys("shweta");
			Thread.sleep(1000);
			g.driver.findElement(By.id("pass")).sendKeys("Password@123");
			Thread.sleep(1000);
			g.driver.findElement(By.name("login")).click();
			Thread.sleep(1000);
			System.out.println(g.driver.getTitle());
			g.close();
		}
	}

