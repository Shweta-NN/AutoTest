package Seleniumpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compare 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		if(title.equals("Facebook"))
		
			System.out.println("Matching");
		
		else
			System.out.println("Not Matching");
		driver.quit();
	}
}
