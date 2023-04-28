package com.sgtesting.exceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Assignment04Statename {

	public static void main(String[] args) {
		 wtite05();
		

	}
	private static void wtite05()
	{
		FileOutputStream g=null;
		Workbook k=null;
		Sheet s=null;
		Row y=null;
		Cell z=null;
		
		try
		{
			k=new XSSFWorkbook();
			s=k.createSheet("states");
			for(int i=0;i<20;i++)
			{
				y=s.createRow(i);
				z=y.createCell(4);
				z.setCellValue("state "+(i+1));
						
			}
			g=new FileOutputStream("E:\\Excel\\assignment04.xlsx");
			k.write(g);
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
