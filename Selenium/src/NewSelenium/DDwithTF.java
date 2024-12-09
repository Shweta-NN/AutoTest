package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDwithTF 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/search?sublist=2");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//lable[.=''State]"));
		ele.click();
		
	}
}
