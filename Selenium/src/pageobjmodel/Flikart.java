package pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flikart 
{
	@FindBy(xpath = "//div[.='SAMSUNG Galaxy S23 5G (Cream, 128 GB)']")
	private WebElement mob;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement buy;
	
	public Flikart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void mobclick()
	{
		mob.click();
	}
	public void buyclick() 
	{
		
	}
	
	
}
