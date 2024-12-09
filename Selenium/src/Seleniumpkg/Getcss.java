package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcss 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement btn= driver.findElement(By.name("login"));
		int height=btn.getSize().getHeight();
		int width = btn.getSize().getWidth();
		System.out.println("the height of element is"+" "+height);
		System.out.println("the height of element is"+" "+width);
		Thread.sleep(1000);
		driver.quit();
	}
}
