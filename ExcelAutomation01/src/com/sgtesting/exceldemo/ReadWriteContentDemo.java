package com.sgtesting.exceldemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ReadWriteContentDemo {

	public static void main(String[] args) {
		readRecordfromTable();
	}
	private static void readRecordfromTable()
	{
		Connection conn=null;
		try
		{
			Class.forName("Oracle.jdbc.driver.Oracledriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
			System.out.println("Connection has Established Successfully");
			Statement stmt=conn.createStatement();
			String query="select * from dept";
			ResultSet rs= stmt.executeQuery(query);

			ResultSetMetaData rsdata=rs.getMetaData();
			String col1=rsdata.getColumnName(1);
			String col2=rsdata.getColumnName(2);
			String col3=rsdata.getColumnName(3);
			System.out.printf("%-12s",col1);
			System.out.printf("%-12s",col2);
			System.out.printf("%-12s",col3);

			while(rs.next())
			{
				String deptno=rs.getString("DEPTNO");
				String dname=rs.getString("DNAME");
				String loc=rs.getString("Loc");
				System.out.printf("%-12s",deptno);
				System.out.printf("%-12s",dname);
				System.out.printf("%-12s",loc);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
	}

}


