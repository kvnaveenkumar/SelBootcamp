package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JavaUtils extends SeleniumUtils{

	static DataFormatter formatter = new DataFormatter();
	
	
	public static String excelValue(String sheetName,int rowNumber,int cellNumber) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook(".\\Inputs\\InputData.xlsx");
		XSSFSheet sheet=workbook.getSheet(sheetName);
		String cellValue=formatter.formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
		workbook.close();
		return cellValue;
	}
}
