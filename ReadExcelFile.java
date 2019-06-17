package com.dd;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ReadExcelFile {
XSSFWorkbook wb;
XSSFSheet sheet;
@BeforeTest
public void ReadExcelFile(String excelPath) throws IOException {
	
	
		File Src=new File(excelPath);
		FileInputStream fis=new FileInputStream(Src);
		wb= new XSSFWorkbook(fis);
	
	
}
@Test
	public String getData (int SheetNumber,int row,int Coloum)
	{
		sheet=wb.getSheetAt(SheetNumber);
		String data=sheet.getRow(row).getCell(Coloum).getStringCellValue();
		return data;
	}
@Test
	public int getRowCount(int SheetIndex) {
		int row=wb.getSheetAt(SheetIndex).getLastRowNum();
		row=row+1;
		return row;}
}

