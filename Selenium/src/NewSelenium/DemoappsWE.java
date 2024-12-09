package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoappsWE  	

{
	public static void main(String[] args) throws InterruptedException 


	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(8000);
		WebElement ele = driver.findElement(By.xpath("//button[.='Register']"));
		boolean d = ele.isDisplayed();
		System.out.println(d);
	
		boolean e = ele.isEnabled();
		System.out.println(e);
	
		String t = ele.getText();
		System.out.println(t);

	}
}
