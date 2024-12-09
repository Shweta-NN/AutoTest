package NewSelenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BeforeAFterClass extends Generic_Beforeclass
{
	@Test
	public void fbrequest() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='shweta_nirvani18']")).click();
	}

}
