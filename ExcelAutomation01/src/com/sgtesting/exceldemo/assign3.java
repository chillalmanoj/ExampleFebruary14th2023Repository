package com.sgtesting.exceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class assign3 {

	public static void main(String[] args) {
		citynames();

	}
	private static void citynames()
	{
		FileOutputStream h=null;
		Workbook k=null;
		Sheet l=null;
		Row g=null;
		Cell c=null;

		try
		{
			k=new XSSFWorkbook();
			l=k.createSheet("city");
			for(int i=0;i<20;i++)

			{
				g=l.createRow(i);
				for(int j=i;j<20;j++)
				{
					c=g.createCell(i);
					c.setCellValue("city "+(i+1));
				}
			}
			h=new FileOutputStream("E:\\Excel\\city.xlsx");
			k.write(h);


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
