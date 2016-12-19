package Goods;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		System.out.println(this.getClass()+"doPost 실행");
		GoodsDao dao = new GoodsDao();
		
	}

}
