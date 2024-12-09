package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependacy
{
	@Test
	public void facebookLogin()
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement e1 = driver.findElement(By.id("pass"));
		String t1 = e1.getTagName();
		System.out.println(t1);
		driver.quit();
	}
	
	@Test(dependsOnGroups = "facebookLogin")
	public void forgotPassword()
	{
		System.out.println("forgot password");
	}
}
