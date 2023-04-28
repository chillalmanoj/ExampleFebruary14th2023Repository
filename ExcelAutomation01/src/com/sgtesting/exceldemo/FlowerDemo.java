package com.sgtesting.exceldemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlowerDemo {

	public static void main(String[] args) {
		fruitname();
	}
    private static void fruitname()
    {
    		FileOutputStream f=null;
    		Workbook k=null;
    		Sheet m=null;
    		Row l=null;
    		Cell j=null;
    		
    		try
    		{
    			k=new XSSFWorkbook();
    			m=k.createSheet("Flower");
    			l=m.createRow(9);
    			for(int i=0; i<20;i++)
    			{
    				
    				j=l.createCell(i);
    				j.setCellValue("Flower"+(i+1));
 
    			}
    			f=new FileOutputStream("E:\\Excel\\demo.xlsx");
    					k.write(f);
    				
    					
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
