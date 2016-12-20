package Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import DBUtil.DBUtil;
import dto.Member;

public class MemberDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Member member = null;
	ArrayList<Member> memberList = null;

	//02 전체회원정보조회
	public ArrayList<Member> MemberAllSelect(){
		try{
			System.out.println("02전체회원정보조회 메서드 선언 MemberDao.java");
			memberList = new ArrayList<Member>();
			System.out.println("memberList : "+memberList);
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(
					"SELECT * FROM MEMBER");
			rs = pstmt.executeQuery();
			while(rs.next()){
				member.setMember_id(rs.getString("member_id"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_level(rs.getString("member_level"));
				member.setMember_addr(rs.getString("member_addr"));
				member.setMember_phone(rs.getString("member_phone"));
				memberList.add(member);
				System.out.println("memberList : "+memberList);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null, null);
		}
		
		return memberList;
		
	}
	
	
	//01 입력처리
	public void MemberAdd(Member member) {
		try{
		System.out.println("01 입력처리메서드 선언MemberDao.java");
		conn = DBUtil.getConnection();
		pstmt = conn.prepareStatement(
				"INSERT INTO MEMBER VALUES (?,?,?,?,?,?)");
		System.out.println(pstmt+"<--pstmt 1");
		
		pstmt.setString(1, member.getMember_id());
		pstmt.setString(2, member.getMember_pw());
		pstmt.setString(3, member.getMember_name());
		pstmt.setString(4, member.getMember_level());
		pstmt.setString(5, member.getMember_addr());
		pstmt.setString(6, member.getMember_phone());
		System.out.println(pstmt+"<--pstmt2");
		pstmt.executeUpdate();
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, null, null);
		}
	}

}


