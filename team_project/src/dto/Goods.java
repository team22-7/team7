package dto;

public class Goods {
	private String goods_code = null;
	private String member_id = null;
	private String goods_name = null;
	private String goods_cate = null;
	private int goods_price = 0;
	private int goods_point = 0;
	private String goods_color = null;
	private String goods_buy_date = null;
	private int goods_buy_count = 0;
	private int goods_stock = 0;
	private String goods_brand = null;
	private int goods_size = 0;
	private int goods_buy_price = 0;
	public String getGoods_code() {
		return goods_code;
	}
	public void setGoods_code(String goods_code) {
		System.out.println("Goods dto goods_code : "+goods_code);
		this.goods_code = goods_code;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		System.out.println("Goods dto member_id : "+member_id);
		this.member_id = member_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		System.out.println("Goods dto goods_name : "+goods_name);
		this.goods_name = goods_name;
	}
	public String getGoods_cate() {
		return goods_cate;
	}
	public void setGoods_cate(String goods_cate) {
		System.out.println("Goods dto goods_cate : "+goods_cate);
		this.goods_cate = goods_cate;
	}
	public int getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(int goods_price) {
		System.out.println("Goods dto goods_price : "+goods_price);
		this.goods_price = goods_price;
	}
	public int getGoods_point() {
		return goods_point;
	}
	public void setGoods_point(int goods_point) {
		System.out.println("Goods dto goods_point : "+goods_point);
		this.goods_point = goods_point;
	}
	public String getGoods_color() {
		return goods_color;
	}
	public void setGoods_color(String goods_color) {
		System.out.println("Goods dto goods_color : "+goods_color);
		this.goods_color = goods_color;
	}
	public String getGoods_buy_date() {
		return goods_buy_date;
	}
	public void setGoods_buy_date(String goods_buy_date) {
		System.out.println("Goods dto goods_buy_date : "+goods_buy_date);
		this.goods_buy_date = goods_buy_date;
	}
	public int getGoods_buy_count() {
		return goods_buy_count;
	}
	public void setGoods_buy_count(int goods_buy_count) {
		System.out.println("Goods dto goods_buy_count : "+goods_buy_count);
		this.goods_buy_count = goods_buy_count;
	}
	public int getGoods_stock() {
		return goods_stock;
	}
	public void setGoods_stock(int goods_stock) {
		System.out.println("Goods dto goods_stock : "+goods_stock);
		this.goods_stock = goods_stock;
	}
	public String getGoods_brand() {
		return goods_brand;
	}
	public void setGoods_brand(String goods_brand) {
		System.out.println("Goods dto goods_brand : "+goods_brand);
		this.goods_brand = goods_brand;
	}
	public int getGoods_size() {
		return goods_size;
	}
	public void setGoods_size(int goods_size) {
		System.out.println("Goods dto goods_size : "+goods_size);
		this.goods_size = goods_size;
	}
	public int getGoods_buy_price() {
		return goods_buy_price;
	}
	public void setGoods_buy_price(int goods_buy_price) {
		System.out.println("Goods dto goods_buy_price : "+goods_buy_price);
		this.goods_buy_price = goods_buy_price;
	}
	
} 
