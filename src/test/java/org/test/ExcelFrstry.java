package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFrstry {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\@selenium\\maven\\Excel\\yoga.xlsx");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fileInputStream);
	   Sheet sheet = book.getSheet("Amazon");
	   Row createRow = sheet.createRow(0);
	   Cell createCell = createRow.createCell(0);
    	 createCell.setCellValue("Name");
    	 
    	 FileOutputStream fileOutputStream= new FileOutputStream(file);
    	 book.write(fileOutputStream);
    	 
    	 System.out.println("ok!!!!!");
	}

}
