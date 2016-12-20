package Goods;

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
	/*�÷��� 12��
	goods_code member_id goods_name goods_cate goods_price 
	goods_color goods_buy_date goods_buy_count goods_stock goods_brand 
	goods_size goods_buy_price*/
	//���̺� Goods
	//��� : ����ȭ�� �����ֱ� ���� �ϳ��� �÷��� ��ȸ
	public Goods GoodsUpdateForSelect (String Goods) {
		System.out.println(this.getClass()+"��ǰ�����ϱ� ���� ��ȸ �޼���");
		String sql = "SELECT * FROM goods WHERE goods_code=?";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, Goods);
			rs = pstmt.executeQuery();
			if (rs.next()) {
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
				goods.setGoods_buy_price(rs.getInt("goods_buy_price"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, null, rs);
		}
		return goods;
	}
	
	//���̺� Goods
	//��� : ��ǰ�߰�
	public void GoodsInsert(Goods goods) {
		System.out.println(this.getClass()+"��ǰ�߰� �޼���");
		String sql = "INSERT INTO goods VALUES (?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?)";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getGoods_code());
			pstmt.setString(2, goods.getMember_id());
			pstmt.setString(3, goods.getGoods_name());
			pstmt.setString(4, goods.getGoods_cate());
			pstmt.setInt(5, goods.getGoods_price());
			pstmt.setString(6, goods.getGoods_color());
			pstmt.setString(7, goods.getGoods_buy_date());
			pstmt.setInt(8, goods.getGoods_buy_count());
			pstmt.setInt(9, goods.getGoods_stock());
			pstmt.setString(10, goods.getGoods_brand());
			pstmt.setInt(11, goods.getGoods_size());
			pstmt.setInt(12, goods.getGoods_buy_price());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, null, null);
		}
	}
	//���̺� Goods
	//��� : ��ü��ǰ��ȸ
	public ArrayList<Goods> GoodsSelectAll () {
		System.out.println(this.getClass()+"��ü��ǰ��ȸ �޼���");
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
