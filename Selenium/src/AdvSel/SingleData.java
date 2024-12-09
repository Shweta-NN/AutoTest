package AdvSel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
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
		
		
	}
}
