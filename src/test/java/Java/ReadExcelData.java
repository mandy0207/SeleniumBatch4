package Java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {

	@Test
	public void readExcelData() throws IOException {
		
		String path = "C:\\Users\\InfoBahn\\eclipse-workspace\\SeleniumAutomation\\testData.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook xs = new XSSFWorkbook (fis);
		Sheet sh=xs.getSheet("Sheet1");
		Row row=sh.getRow(1);
		Cell cell1 = row.getCell(0);
		
		Cell cell2 = row.getCell(1);
		
		Cell cell3 = row.getCell(2);
		
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		
		
		

	}

}
