package in.sp.app.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {

	final static String USER_NAME = "root";
	final static String PASSWORD = "1234";
	final static String DB_URL = "jdbc:mysql://localhost:3306/project1";
	final static String DRIVER = "com.mysql.cj.jdbc.Driver";

	public static Connection getCon() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		return conn;
	}
}
