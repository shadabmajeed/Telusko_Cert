package com.telusko.jdbc_sample;
import java.sql.*;
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
       /*
        * Import package
        * Load Driver
        * Connection
        * Create Statement
        * Execute Statement
        * Process Statement
        * Close Connection 
        */
        final String uname = "postgres";
    	final String password = "0000";
    	final String url = "jdbc:postgresql://localhost:5432/jdbc_demo";
    	Connection con = null;
    	Statement st = null;
    	try {
    		 Class.forName("org.postgresql.Driver");	 //load driver
    		 con = DriverManager.getConnection(url, uname, password); // create connection
    		 st = con.createStatement();
    	}
    	catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
        if(con!=null)
        {
        	// Fetch
        	String query = "Select * from student";
        	
        	try {
				ResultSet result  = st.executeQuery(query);
				
				while(result.next())
				{
					System.out.println(result.getString(1)+":"+result.getString(2)+":"+result.getString(3));	
				}
				
							
			} catch (SQLException e) {
				e.printStackTrace();
			}
        	
        	// Insert
        	String insertQuery = "insert into student values(?,?,?)";
        	PreparedStatement pst = con.prepareStatement(insertQuery);
        	pst.setInt(1, 3);
        	pst.setString(2, "junaid");
        	pst.setInt(3, 45);
        	pst.execute();
        	con.close();
        }
    	
    	
    }
}
