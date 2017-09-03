package testDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class testDB {
 
	private static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME="SYSTEM";
	private static final String PASSWORD="root";
	
	 
    public static Connection  getConnection(){
    	Connection con = null;
    	
    	try {
			 Class.forName(DRIVER);
			 con  = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				System.out.println("Connection established...1");
		    	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    	return con;
    	
    }
    
    public static void closeConnection(Connection con){
    	
    	if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
    
    
      public static void closeStatement(PreparedStatement ps){
    	
    	if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
      public static void main(String args[])
      {
    	  System.out.println("Hello World");
      }
}
