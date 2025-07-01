package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author dell
 */
public class ExcelUtility {
	/**
	 * This method is used to read data from excel file in String format
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetName, int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	}
	
	public double getNumberDataFromExcel(String sheetName, int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
	}
	
	public boolean getBooleanDataFromExcel(String sheetName, int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getBooleanCellValue();
	}
	
	public LocalDateTime getDateAndTimeFromExcel(String sheetName, int rowIndex, int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getLocalDateTimeCellValue();
	}
	
}
