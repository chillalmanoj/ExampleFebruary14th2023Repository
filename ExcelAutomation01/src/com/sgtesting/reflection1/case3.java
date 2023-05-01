package com.sgtesting.reflection1;

import java.lang.reflect.Method;

public class case3 {

	public static void main(String[] args) {
		  SampleDemo obj=new SampleDemo();
		  try
		  {
			  Method method[]=obj.getClass().getDeclaredMethods();
			  for(int i=0;i<method.length;i++)
			  {
				  String name=method[i].getName();
				  System.out.println(name);
				  method[i].invoke(obj);
			  
			  }
			  
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }

	}

}
