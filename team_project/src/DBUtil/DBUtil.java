package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	public static void close(Connection conn, PreparedStatement pstmt, Statement stmt, ResultSet rs) {
        if(rs != null) {
            try {
            	rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt != null) {
            try {
            	stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(pstmt != null) {
            try {
            	pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null) {
            try {
            	conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}