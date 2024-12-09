package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("just add magic full episodes season 1 ");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy'] ")).click();
		driver.findElement(By.xpath("//div[@id='thumbnail-container']")).click();
	}
}
