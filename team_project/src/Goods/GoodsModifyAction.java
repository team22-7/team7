package Goods;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/goods/GoodsDetailAction.jbh")
public class GoodsModifyAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public GoodsModifyAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(this.getClass()+"doGet ½ÇÇà");
		
		
		
		response.sendRedirect(request.getContextPath()+"/goods/Goods_modify.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
