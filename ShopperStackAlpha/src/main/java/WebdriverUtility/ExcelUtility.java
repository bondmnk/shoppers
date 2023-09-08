package WebdriverUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String exelFile(String sheetName,int rownumber, int columnnumber) throws Throwable, IOException
	{
		File xlFile = new File("C:\\excelfile\\parool.xlsx");
		FileInputStream File =new FileInputStream(xlFile);
		Workbook workbook = WorkbookFactory.create(File);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row =sheet.getRow(rownumber);
		Cell cell = row.getCell(columnnumber);
		String value = cell.getStringCellValue();
		return value;
	}
}
