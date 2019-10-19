package seleniumUtil;

import java.io.FileInputStream;
import java.io.IOException;
//import org.appache.poi

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public String[][] getExcelData(String filePath, String sheetName) throws IOException {
		String[][] arrayExcelData = null;
		
		FileInputStream fs = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet ws = wb.getSheet(sheetName);
		
		int rowNo = ws.getLastRowNum();
		int colCount = ws.getRow(0).getLastCellNum();
		
		arrayExcelData = new String [rowNo][colCount];
		
		for(int i=0; i<rowNo; i++) {
			XSSFRow row = ws.getRow(i+1);
			for(int j=0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				arrayExcelData[i][j] = value;	
			}
		}
		return arrayExcelData;
		
	}

}
