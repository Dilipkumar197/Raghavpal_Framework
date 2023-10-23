package Utilis;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	static XSSFWorkbook workbook;

	static XSSFSheet sheet;
	
	public Excelutils ( String Excelpath , String sheetName) {
		
		
		try {

			workbook = new XSSFWorkbook(Excelpath);
			sheet=workbook.getSheet(sheetName);
		}
		
		catch(Exception exp){
			exp.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		getRowCount();
		getCellDataString(0,0); 
		getCellDataNumber(1,1);
	}


	public static int getRowCount()  {
	
	int rowcount=0;
	{
		try {

			rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows :"+rowcount);

		}
		catch ( Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		
		return rowcount;
	}
	}
	
	public static int getColCount()  {

	int colcount=0;
	{
		try {

			colcount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of cols :"+colcount);

		}
		catch ( Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		
		return colcount;
	}
	}
	
	
	public static String getCellDataString(int rowNum , int colNum)  {

		String cellData=null;
		try {

			
			 cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
		}

		catch ( Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
        return cellData;
	}

	
	public static void getCellDataNumber(int rowNum , int colNum) {


		try {

			
			String cellnumber= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellnumber);
		}

		catch ( Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}



}
