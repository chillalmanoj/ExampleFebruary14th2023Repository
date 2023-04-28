package com.sgtesting.exceldemo;

public class demo1 {

	public static void main(String[] args) {
	
		writecontent();
	}
   private static void writecontent()
   {
	   for(int i=0;i<5;i++)
	   {
		  for(int j=0;j<i;j++)
		  {
			  System.out.print("#");
		  }
		  System.out.println();
	   }
   }
}
