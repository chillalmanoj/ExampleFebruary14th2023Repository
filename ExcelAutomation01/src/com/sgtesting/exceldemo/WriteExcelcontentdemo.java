package com.sgtesting.exceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelcontentdemo {

	public static void main(String[] args) {
		writecontentdemo();
		
	}
	private static void writecontentdemo() 
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Project");
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("Username");
			
			cell=row.createCell(1);
			cell.setCellValue("Password");
			
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("admin");
			
			cell=row.createCell(1);
			cell.setCellValue("manager");
			
			fout=new FileOutputStream("E:\\Excel\\text.xlsx");
					wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}	
			
			
			
			
		}
		
		
	}
}





