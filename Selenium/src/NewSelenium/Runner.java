package NewSelenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner extends GenericAnnotation
{
	@Test
	public void fblogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("shweta");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Password@123");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
				
	}

}
