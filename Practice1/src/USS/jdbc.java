package USS;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class jdbc {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream ("C:\\Users\\HP\\eclipse-workspace");
			Properties properties = new Properties();
			properties.load(fis);
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String Sqlquery = "select* from emp";
			ResultSet rs = stmt.executeQuery(Sqlquery);
			
			while (rs.next()) {
				int id = rs.getInt
			}
			
			
			
			
			
		}
		// TODO Auto-generated method stub

	}

}
