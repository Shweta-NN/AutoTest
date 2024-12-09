package NewSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner2 extends GenericAnnotation
{
	@Test
	public void openfb() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("shweta");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Password@123");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Assert.fail();
		
	}
	
	@Test
	public void fblogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("shweta");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Password@123");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
	}

}
