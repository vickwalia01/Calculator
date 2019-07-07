package PoiApche;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting_2 {
	
	
	
	public static final String NewFile = System.getProperty("user.dir")+ "/Reciept.xlsx";

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("reciept");
		
		System.out.println("Star Creating Excel Table: header rows & columns");
		String[] columnHeader= {"Productnum", "Item Name","Quantity", "Item Price","SubTotal", "Discount", "Tax", "Total"}; 
		Row headerRow = sheet.createRow(0);
		int headerColPointer = 0;
		for (int i=0;i<6;i++) {
			Cell headerCell = headerRow.createCell(headerColPointer++);
			headerCell.setCellValue((String)columnHeader[i]);
		}
		
		System.out.println("Start Adding data from 2nd row of excel files");
		Object[][] rowData = {
				{1," Mangoes",5,2,10,0,0,10},
				{2,"Beer", 10,5,50,0,0,50},
				{3,"Meat",10,10,100,0,0,100},
		};
		
		int rowPointer = 1;
		for(int m=0; m<rowData.length;m++) {
			Row row = sheet.createRow(rowPointer++);
			
			int colPointer = 0;
			for (int x=0;x<6;x++) {
				Cell cell=row.createCell(colPointer++);
				if (rowData[m][x] instanceof Integer) {
					cell.setCellValue((Integer) rowData[m][x]);
				}
				else if (rowData[m][x] instanceof String) {
					cell.setCellValue((String)rowData[m][x]);
				}
				else if(rowData[m][x] instanceof Double) {
					cell.setCellValue((Double)rowData[m][x]);
				
				}
			}
		}
			
	//	creating file OutPUtStream	& Saving all Stream data to Excel file
		
		try {
			FileOutputStream outputStream = new FileOutputStream(NewFile);
			workbook.write(outputStream);
			workbook.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("done");
			
			
	}	
}			
				
				
				
				
				
				
	
		
		
		
		
		
		
	


