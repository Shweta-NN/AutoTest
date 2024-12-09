package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		WebElement title=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		System.out.println(title.getText());
		title.click();
		WebElement ele = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/following-sibling::div[2]"));
		String s1 = ele.getText();
		ele.click();
		System.out.println(s1);
		driver.findElement(By.id("add-to-cart")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		WebElement title1 = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		System.out.println(title1.getText());
		title1.click();
		WebElement ele1 = driver.findElement(By.xpath("//div[.='$29.99']"));
		String t1 = ele1.getText();
		System.out.println(t1);
		
		if(s1.equals(t1) && title.equals(title1))
			System.out.println("matching title and price");
		else
			System.out.println("not matching title and price");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
