package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aventstack.extentreports.utils.FileUtil;

public class JavaUtils extends SeleniumUtils{

	static DataFormatter formatter = new DataFormatter();
	
	
	public static String excelValue(String sheetName,int rowNumber,int cellNumber) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook(".\\Inputs\\InputData.xlsx");
		XSSFSheet sheet=workbook.getSheet(sheetName);
		String cellValue=formatter.formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
		workbook.close();
		return cellValue;
	}
	public static void copyFile(String Filename,String extension){
		File source=new File("C:\\Users\\naveenkumar_kv\\Downloads\\"+Filename+extension+"");
		File destination=new File(".\\Downloads\\"+Filename+extension+"");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(source.exists()){
			source.deleteOnExit();
		}
		
	}
}
