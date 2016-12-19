package Goods.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.DBUtil;
import dto.Goods;

@WebServlet("/goods/GoodsList.jbh")
public class GoodsListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoodsListAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(this.getClass()+"����");
		GoodsDao goodsdao = new GoodsDao();
		ArrayList<Goods> goods = goodsdao.GoodsSelectAll();
		request.setAttribute("goods", goods);
		RequestDispatcher rd = request.getRequestDispatcher(
				"/goods/Goods_list.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
