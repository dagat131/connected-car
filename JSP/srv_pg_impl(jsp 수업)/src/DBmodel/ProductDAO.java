package DBmodel;

import java.sql.*;


public class ProductDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void getConn() {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/sihum";
			String dbId = "sihum";
			String dbPw = "1234";
			
			Class.forName(driver);
			conn = DriverManager.getConnection(dbUrl,dbId,dbPw);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int setInsert(ProductBean bean) {
		int result = 0;
		getConn();
		try {
			String sql = "insert into member values (?,?,?,?,now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setNull(1, java.sql.Types.NULL);
			pstmt.setString(2, bean.getCate());
			pstmt.setString(3, bean.getPname());
			pstmt.setInt(4, bean.getPrice());
			
			result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
