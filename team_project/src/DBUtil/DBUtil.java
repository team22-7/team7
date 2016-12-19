package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static final String driver;
	private static final String url;
	private static final String user;
	private static final String pw;
	static {
		driver = "com.mysql.jdbc.Driver"; 
		url = "jdbc:mysql://127.0.0.1:3306/team7db?useUnicode=true&characterEncoding=euckr";
		user = "team7";
		pw = "1234";
	}
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, pw);
			System.out.println("MySql jdbc test DBUtil connect :" + connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	public static void close(Connection connection, Statement statement, ResultSet resultset) {
        if(resultset != null) {
            try {
                resultset.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


