package TestCases1;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pomclass.HomePage;
import Pomclass.LoginPage;
import Pomclass.WelcomePage;
import WebdriverUtility.ExcelUtility;
import WebdriverUtility.PropertiesUtility;

public class LoginX{

	
		@Test
	public void Tc_Login_001() throws Throwable
	{
		
//		File file =new File("./src/main/resources/TestData/testdatalogin.properties");
//		FileInputStream fis =new FileInputStream(file);
//		Properties properties = new Properties();
//		properties.load(fis);
//		String Url = properties.getProperty("Browser");
//		System.out.println(Url);
//		File xlFile = new File("C:\\excelfile\\parool.xlsx");
//		FileInputStream File =new FileInputStream(xlFile);
//		Workbook workbook = WorkbookFactory.create(File);
//		Sheet sheet = workbook.getSheet("Sheet1");
//		Row row =sheet.getRow(0);
//		Cell cell = row.getCell(1);
//		String name = cell.getStringCellValue();
//		System.out.println(name);
		
//		ExcelUtility execlu=new ExcelUtility();
//		String name=execlu.exelFile("sheet1", 0, 1);
//		System.out.println(name);
		System.out.println("------Launching the Browser-----");
		
		
		
		//WelcomePage welpage =new WelcomePage(driver);
		//welpage.getloginButtonWelcomePage().click();
		
		
		
		
		
		}
	}

