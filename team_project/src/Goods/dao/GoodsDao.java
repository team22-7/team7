package Goods.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import DBUtil.DBUtil;

public class GoodsDao {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	/*String sql = "SELECT goods_code, member_id, goods_name, "
			+ "goods_cate, goods_price, goods_color, "
			+ "goods_buy_date, goods_buy_count, goods_stock, "
			+ "goods_brand, goods_size, goods_buy_price FROM goods";
	try {
		conn = DBUtil.getConnection();
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		
	}*/
}
