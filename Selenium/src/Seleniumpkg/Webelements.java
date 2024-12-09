package Seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Admin\\Desktop\\HTML\\WebElement.html");
		WebElement usn=driver.findElement(By.id("usn"));
		boolean res = usn.isDisplayed();
		System.out.println(res);
		
		boolean res1 = usn.isEnabled();
		System.out.println(res1);
		
		boolean res2 = usn.isSelected();
		System.out.println(res2);
		
		WebElement cb=driver.findElement(By.name("checkbox"));
		boolean res3 = cb.isSelected();
		System.out.println(res3);
	}
}
