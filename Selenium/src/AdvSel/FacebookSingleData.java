package AdvSel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSingleData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		FileInputStream fis=new FileInputStream("./Excel/Sheet1.xlsx");
		Workbook Book=WorkbookFactory.create(fis);
		Sheet sheet = Book.getSheet("Sheet1");
		Row rw = sheet.getRow(0);
		Cell cl = rw.getCell(0);
		String usn = cl.getStringCellValue();
		System.out.println(usn);
		
		Cell cl1 = rw.getCell(1);
		String psw = cl1.getStringCellValue();
		System.out.println(psw);
		
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(usn);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(psw);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		//driver.quit()
	}
}
