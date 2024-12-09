package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeXpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("night changes song");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='One Direction - Night Changes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//like-button-view-model[@class='YtLikeButtonViewModelHost'] ")).click();
	}
}
