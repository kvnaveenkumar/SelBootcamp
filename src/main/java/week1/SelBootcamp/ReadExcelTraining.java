package week1.SelBootcamp;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelTraining {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook=new XSSFWorkbook(".\\Inputs\\InputData.xlsx");
		XSSFSheet sheet=workbook.getSheetAt(1);
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		workbook.close();

	}

}
