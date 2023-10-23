package Utilis;

public class Excelutilsdemo {

	public static void main(String[] args) {
		
		//Excelutils excel = new Excelutils("C://Users//Dilipkumar//Documents//Demodata1.xlsx", "testdata");
		
		
		Excelutils excel = new Excelutils("C:\\Users\\Dilipkumar\\OneDrive\\Desktop//Demodata1.xlsx", "testdata");
		excel.getCellDataNumber(0, 0);
		excel.getCellDataString(1, 2);
		excel.getRowCount();
		excel.getColCount();
	}

}
