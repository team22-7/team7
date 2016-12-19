package Goods.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import DBUtil.DBUtil;
import dto.Goods;

public class GoodsDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	Goods goods = null;
	ArrayList<Goods> agl = null;
	//전체상품조회
	public ArrayList<Goods> GoodsSelectAll () {
		agl = new ArrayList<Goods>();
		String sql = "SELECT goods_code, member_id, goods_name, "
				+ "goods_cate, goods_price, goods_color, "
				+ "goods_buy_date, goods_buy_count, goods_stock, "
				+ "goods_brand, goods_size, goods_buy_price FROM goods";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				goods = new Goods();
				goods.setGoods_code(rs.getString("goods_code"));
				goods.setMember_id(rs.getString("member_id"));
				goods.setGoods_name(rs.getString("goods_name"));
				goods.setGoods_cate(rs.getString("goods_cate"));
				goods.setGoods_price(rs.getInt("goods_price"));
				goods.setGoods_color(rs.getString("goods_color"));
				goods.setGoods_buy_date(rs.getString("goods_buy_date"));
				goods.setGoods_buy_count(rs.getInt("goods_buy_count"));
				goods.setGoods_stock(rs.getInt("goods_stock"));
				goods.setGoods_brand(rs.getString("goods_brand"));
				goods.setGoods_size(rs.getInt("goods_size"));
				goods.setGoods_price(rs.getInt("goods_buy_price"));
				agl.add(goods);
				System.out.println(this.getClass()+"GoodsSelectAll agl : "+agl);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, null, rs);
		}
		return agl;
	}
	
}
