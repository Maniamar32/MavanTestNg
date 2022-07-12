package com.hyr.dataproviderWithExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExceldataDataprovider {
 
	@Test
	
	public void TestData() throws Exception {
	
		File file=new File("./src/test/resources/ExcelFile/LoginExcel.xlsx");
		//System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
	     XSSFWorkbook workbook=new XSSFWorkbook(fis);
	     XSSFSheet sheet=workbook.getSheet("Sheet1");
	     int noOfRows=sheet.getPhysicalNumberOfRows();
	     int noOfColoums=sheet.getRow(0).getLastCellNum();
	     for(int i=0;i<noOfRows;i++) {
	    	 for(int j=0;j<noOfColoums;j++) {
	    		 
	    	 }
	     }
	     
	     
	     
				
	}
	
	
}
