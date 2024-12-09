package pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScript 
{
	@FindBy(id = "email")
	private WebElement UName;
	public  PomScript(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void passData()
	{
		UName.sendKeys("admin");
	}
}
