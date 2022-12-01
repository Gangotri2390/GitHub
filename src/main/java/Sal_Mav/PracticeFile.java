package Sal_Mav;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeFile {

	public static void main(String[] args) throws IOException {
	
		XSSFWorkbook workbook=new XSSFWorkbook ("D:\\Downloads\\GangotriWorkbook.xlsx");
		XSSFSheet sheet= workbook.getSheet("Sheet1");
//System.out.println(sheet.getPhysicalNumberOfRows());
//System.out.println(sheet.getRow(4).getLastCellNum());
	
	}
}

