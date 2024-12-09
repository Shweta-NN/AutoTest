package AdvSel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleData 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fs=new FileInputStream("./Excel/Sheet1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int lr = sheet.getLastRowNum();
		for (int i = 0; i < lr; i++) 
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell cel = row.getCell(0);
			String c1val = cel.getStringCellValue();
			System.out.println(c1val);
		}
		workbook.close();
		fs.close();
		
	}

}
