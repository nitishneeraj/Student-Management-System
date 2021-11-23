import java.sql.*;
import java.io.*;

class Db
{
	public static void main(String s[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drive Class Loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","");
			System.out.println("Connection Created");
			Statement st=con.createStatement();
			System.out.println("Statement object Created");
			ResultSet rs=st.executeQuery("Select * from Student");	
			while(rs.next())	
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			rs.close();
			st.close();
			con.close();
		}catch(Exception e)
		{
			System.out.println("Error");
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		