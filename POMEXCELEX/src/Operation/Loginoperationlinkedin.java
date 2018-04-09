package Operation;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Repository.Inspectlinkedin;

public class Loginoperationlinkedin {
	WebDriver driver;

	public static void excel() throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\NAGESHWARI\\Desktop\\linkedin.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet1=workbook.getSheetAt(0);
        XSSFCell cell ;
		System.out.println("sheet1.getLastRowNum() "+sheet1.getLastRowNum());
       for(int i=1;i<=sheet1.getLastRowNum();i++)
        {
           	
           cell=sheet1.getRow(i).getCell(0);
           
           Inspectlinkedin.user().sendKeys(cell.getStringCellValue());     	
       
        Thread.sleep(4000);
        cell=sheet1.getRow(i).getCell(1);
        cell.setCellType(cell.CELL_TYPE_STRING);
       	String data =cell.getStringCellValue();
       	System.out.println("data on excell "+data);
       	Inspectlinkedin.pswd().sendKeys(cell.getStringCellValue());
       	Inspectlinkedin.submit().click();
        
	}

}
}
