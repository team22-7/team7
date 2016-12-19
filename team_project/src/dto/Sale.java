package dto;

public class Sale {
	private int sale_code = 0;
	private String member_id = null;
	private String goods_code = null;
	private int goods_price = 0;
	private int sale_count = 0;
	private String sale_date = null;
	public int getSale_code() {
		return sale_code;
	}
	public void setSale_code(int sale_code) {
		System.out.println("Sale dto sale_code : "+sale_code);
		this.sale_code = sale_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		System.out.println("Sale dto member_id : "+member_id);
		this.member_id = member_id;
	}
	public String getGoods_code() {
		return goods_code;
	}
	public void setGoods_code(String goods_code) {
		System.out.println("Sale dto goods_code : "+goods_code);
		this.goods_code = goods_code;
	}
	public int getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(int goods_price) {
		System.out.println("Sale dto goods_price : "+goods_price);
		this.goods_price = goods_price;
	}
	public int getSale_count() {
		return sale_count;
	}
	public void setSale_count(int sale_count) {
		System.out.println("Sale dto sale_count : "+sale_count);
		this.sale_count = sale_count;
	}
	public String getSale_date() {
		return sale_date;
	}
	public void setSale_date(String sale_date) {
		System.out.println("Sale dto sale_date : "+sale_date);
		this.sale_date = sale_date;
	}
	



}
