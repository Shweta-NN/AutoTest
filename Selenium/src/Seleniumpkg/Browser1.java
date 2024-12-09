package Seleniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 
{
	public static void main(String[] args) 
	{
		String key="webdriver.geckodriver.driver";
		String value="./sw/geckodriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
	}
}
