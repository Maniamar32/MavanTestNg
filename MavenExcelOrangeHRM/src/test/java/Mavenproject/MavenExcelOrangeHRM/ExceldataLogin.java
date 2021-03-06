package Mavenproject.MavenExcelOrangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExceldataLogin {
  @DataProvider(name="excellogindetails")
	public  String[][] getdata() throws Exception {
	File file=new File("./resources/OrangHRMLoginDetails.xlsx");
	//System.out.println(file.exists());  
	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	//System.out.println(sheet.getPhysicalNumberOfRows());
	//System.out.println(sheet.getLastRowNum());
	int noOfRows=sheet.getPhysicalNumberOfRows();
	int noOfColoums=sheet.getRow(0).getLastCellNum();
	String[][] data=new String[noOfRows-1][noOfColoums];

	for(int i=0;i<noOfRows-1;i++) 
	{
		
		for(int j=0;j<noOfColoums;j++) {
			DataFormatter df=new DataFormatter();
			data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			//System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
			//String s=sheet.getRow(i).getCell(j).getStringCellValue();
			//System.out.println(s);
		}
		System.out.println();
		
	}
		workbook.close();
		fis.close();
		//for(String[] dataArr : data) {
			//System.out.println(Arrays.toString(dataArr));}
		//System.out.println(Arrays.toString(data));
	  return data;
		}



	}


