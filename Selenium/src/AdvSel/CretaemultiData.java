package AdvSel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CretaemultiData 
{
	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("AutoFrame");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cel = row.createCell(0);
		cel.setCellValue("SeleniumClass");
		FileOutputStream fos=new FileOutputStream("./Excel/Framework.xlsx");
		book.write(fos);
		book.close();
		fos.close();
		
	}

}
