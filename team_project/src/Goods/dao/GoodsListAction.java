package Goods.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.DBUtil;

@WebServlet("/goods/GoodsList.jbh")
public class GoodsListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoodsListAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT goods_code, member_id, goods_name, goods_cate, goods_price, FROM goods";
		try {
			conn = DBUtil.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
