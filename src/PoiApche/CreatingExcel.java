package PoiApche;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcel {

	public static void main(String[] args) throws IOException {

XSSFWorkbook wb=  new XSSFWorkbook();
XSSFSheet sheet= wb.createSheet("test");
int rowNo = 0;
Row row= sheet.createRow(rowNo++);
int cellnum = 0;
Cell cell= row.createCell(cellnum++);
cell.setCellValue("Decimal");
cell = row.createCell(cellnum++);
cell.setCellValue(2.5);

cellnum=0;
row = sheet.createRow(rowNo++);
cell = row.createCell(cellnum++);
cell.setCellValue("Test");
FileOutputStream out = new FileOutputStream (new File("template/test1.xlsx"));
wb.write(out);
out.close();

System.out.println("done!");

			
	}

}
