package Member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Member;


@WebServlet("/MemberAddAction.jbh")
public class MemberAddAction extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/member/memberAddForm.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String name = request.getParameter("name");
			System.out.println(name);
		String id = request.getParameter("id");
		System.out.println(id);
		String pw = request.getParameter("pw");
			System.out.println(pw);
		String level = request.getParameter("level");
			System.out.println(level);
		String addr = request.getParameter("addr");
			System.out.println(addr);
		String pn1 = request.getParameter("pn1");
		String pn2 = request.getParameter("pn2");
		String pn3 = request.getParameter("pn3");
		String phone = pn1+"-"+pn2+"-"+pn3;
		System.out.println(phone);
		
		Member member = new Member();
		
		member.setMember_name(name);
		member.setMember_id(id);
		member.setMember_pw(pw);
		member.setMember_level(level);
		member.setMember_addr(addr);
		member.setMember_phone(phone);
		
		MemberDao memberDao = new MemberDao();
		
		memberDao.MemberAdd(member);
		
		request.setAttribute("memberDao", memberDao);
		
		request.getRequestDispatcher("/member/memberList.jsp").forward(request, response);
		
	}

}
