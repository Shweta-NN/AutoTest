package NewSelenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturepic 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		String photo = "./photos/";
//		Date d= new Date();
//		String d1 = d.toString();
//		String d2 = d1.replaceAll(":","-");
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dst = new File(photo+d2+".jpeg");
//		FileHandler.copy(src, dst);
		
		GenericPhoto.getPhoto(driver);
		
	}
}
