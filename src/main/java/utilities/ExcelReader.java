package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static int rowcount ;
	
	public static String ReadSheet(String xlpath, int sheetno, int row, int column) throws IOException {
		
		File file = new File (xlpath);
		FileInputStream src = new FileInputStream(file);
		
		
		XSSFWorkbook wb = new XSSFWorkbook(src);
		
	XSSFSheet sheet1=	wb.getSheetAt(sheetno);
	
	String name =sheet1.getRow(row).getCell(column).getStringCellValue();

		wb.close();
		
	 rowcount = sheet1.getLastRowNum();
		
		return name;
	}
	

	
	
}
