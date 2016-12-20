package Goods;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Goods;

@WebServlet("/goods/GoodsAdd.jbh")
public class GoodsAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public GoodsAddAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(this.getClass()+"doGet 실행");
		response.sendRedirect(request.getContextPath()+"/goods/Goods_add.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		System.out.println(this.getClass()+"doPost 실행");
		GoodsDao dao = new GoodsDao();
		
		String goods_code = request.getParameter("goods_code");
		String member_id = request.getParameter("member_id");
		String goods_name = request.getParameter("goods_name");
		String goods_cate = request.getParameter("goods_cate");
		int goods_price = Integer.parseInt(request.getParameter("goods_price"));
		String goods_color = request.getParameter("goods_color");
		String goods_buy_date = request.getParameter("goods_buy_date");
		int goods_buy_count = Integer.parseInt(request.getParameter("goods_buy_count"));
		int goods_stock = Integer.parseInt(request.getParameter("goods_stock"));
		String goods_brand = request.getParameter("goods_brand");
		int goods_size = Integer.parseInt(request.getParameter("goods_size"));
		int goods_buy_price = Integer.parseInt(request.getParameter("goods_buy_price"));
		
		Goods goods = new Goods();
		goods.setGoods_code(goods_code);
		goods.setMember_id(member_id);
		goods.setGoods_name(goods_name);
		goods.setGoods_cate(goods_cate);
		goods.setGoods_price(goods_price);
		goods.setGoods_color(goods_color);
		goods.setGoods_buy_date(goods_buy_date);
		goods.setGoods_buy_count(goods_buy_count);
		goods.setGoods_stock(goods_stock);
		goods.setGoods_brand(goods_brand);
		goods.setGoods_size(goods_size);
		goods.setGoods_buy_price(goods_buy_price);
		
		dao.GoodsInsert(goods);
		response.sendRedirect(request.getContextPath()+"/goods/GoodsList.jbh");
	}

}
