package NewSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyChromeLaunch 
{
	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "./sw/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
	}
}
