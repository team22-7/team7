package dto;

public class Member {
	private String member_id = null;
	private String member_pw = null;
	private String member_name = null;
	private String member_level = null;
	private String member_addr = null;
	private String member_phone = null;
	private int member_point = 0;
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		System.out.println("Member dto member_id : "+member_id);
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		System.out.println("Member dto member_pw : "+member_pw);
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		System.out.println("Member dto member_name : "+member_name);
		this.member_name = member_name;
	}
	public String getMember_level() {
		return member_level;
	}
	public void setMember_level(String member_level) {
		System.out.println("Member dto member_level : "+member_level);
		this.member_level = member_level;
	}
	public String getMember_addr() {
		return member_addr;
	}
	public void setMember_addr(String member_addr) {
		System.out.println("Member dto member_addr : "+member_addr);
		this.member_addr = member_addr;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		System.out.println("Member dto member_phone : "+member_phone);
		this.member_phone = member_phone;
	}
	public int getMember_point() {
		return member_point;
	}
	public void setMember_point(int member_point) {
		System.out.println("Member dto member_point : "+member_point);
		this.member_point = member_point;
	}
	
}
