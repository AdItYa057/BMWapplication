package com.cts.utils;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	  
	 
	
	public static void excelWrite(String filedetails, String sheetname, int rownumber, int cellnumber, String message) throws IOException
	{
		FileOutputStream file = new FileOutputStream(filedetails);
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet(sheetname);
		
		Row row = sheet.createRow(rownumber);
		Cell cell = row.createCell(cellnumber);
		cell.setCellValue(message);
		book.write(file);
		book.close();
		file.close();
	}

}
