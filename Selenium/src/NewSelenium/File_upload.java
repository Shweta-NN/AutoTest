package NewSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_upload 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.get("file:///C:/Users/Admin/Desktop/HTML/New%20Selenium%20Btc/fileupload.html");
		WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\Admin\\Desktop\\HTML\\New Selenium Btc\\fileupload.html");
		Thread.sleep(3000);
		driver.quit();
	}

}
