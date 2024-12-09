package NewSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmptyBrowser 
{
	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		String value = "./sw/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver = new FirefoxDriver();
		
		String key1="webdriver.chrome.driver";
		String value1 = "./sw/chromedriver.exe";
		System.setProperty(key1, value1);
		ChromeDriver driver1 = new ChromeDriver();
		
	}
}
