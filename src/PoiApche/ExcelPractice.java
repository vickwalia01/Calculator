package PoiApche;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;


public class ExcelPractice {

	public static void main(String[] args) throws IOException {
		
	   XSSFWorkbook workbook=new XSSFWorkbook();
       XSSFSheet sheet= workbook.createSheet("First Excel Sheet");
       XSSFRow row= sheet.createRow(0);
       XSSFCell cell= row.createCell(0);
       cell.setCellValue("1.cell");
     //  workbook.close();
       
    
       cell= row.createCell(1);
       DataFormat format= workbook.createDataFormat();
       CellStyle dateStyle= workbook.createCellStyle();
       dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
       cell.setCellStyle(dateStyle);
       cell.setCellValue(new Date());
    		   
    	row.createCell(2).setCellValue("3. Cell");	   
    		   
       workbook.write(new FileOutputStream("excel.xls"));
       workbook.close();
       
       
	}

}
