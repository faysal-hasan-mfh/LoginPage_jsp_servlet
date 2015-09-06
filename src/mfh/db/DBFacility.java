package mfh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBFacility implements ConnectionProvider {

	 Connection conn=null;
	 Statement stmt=null;
	 String sql="";
	
	public Connection connectionDB()
	{
		try{
				Class.forName(driverName);
				conn = DriverManager.getConnection(dbConnectionURL+databaseName,dbUserName,dbUserPassword);
				
				return conn;
		}
		catch(Exception e)
		{
			System.out.println("Problem in connectionDB: "+e);
		}
		return conn;
	}
	
	public boolean valid(String uname, String upassword)
	{
		
		sql= "SELECT userName, userPassword FROM "+dbUserTable+"" +
				" WHERE userName='"+uname+"' AND userPassword='"+upassword+"'";
		
		conn= connectionDB();
		System.out.println("Connection Successful... ");
		
		boolean isUser,isPassword;
		
		isUser=isPassword=false;
		
		try {
			
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			ResultSetMetaData rsmtdata=rs.getMetaData();
			
			String values[] = new String[2];
			int columnNumber =rsmtdata.getColumnCount();
			
			int count=0;
			
			
			while(rs.next())
			{
				for(int i=1;i<=columnNumber;++i)
				{
					String cValue=values[count]=rs.getString(i);
					
					if(cValue.equals(uname))
					{
						isUser=true;
						
					}
					else if(cValue.equals(upassword))
					{
						isPassword=true;
					}
					
					count++;
				}
				
			}
			
			if(isUser&&isPassword)
			{
				System.out.println("True");
				return true;
			}
			else
			{
				System.out.println("False");
				return false;
				
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("Problem in query result method..."+e);
		}
		return false;
	}
	
	public void closeConn()
	{
		try {
				if(!conn.isClosed())
				{
					stmt.close();
					conn.close();
					System.out.println("Connection Successfully Closed.");
				}
				else
				{
					System.out.println("Connection Already Closed.");
					
				}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
