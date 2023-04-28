package com.sgtesting.exceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFruitsDemo {

	public static void main(String[] args) {
		 writefruitDemo();
	}
    private static void writefruitDemo()
    {
    	FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sheet=null;
		Row r=null;
		Cell c=null;
		try
		{
			wb=new XSSFWorkbook();
			sheet=wb.createSheet("Fruit");
			for(int i=0; i<20;i++)
			{
			    r=sheet.createRow(i);
			    c=r.createCell(0);
			    c.setCellValue("Fruit"+(i+1));		
			}
		fout=new FileOutputStream("E:\\Excel\\demo02.xlsx");
		wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
    }
}
