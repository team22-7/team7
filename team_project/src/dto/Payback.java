package dto;

public class Payback {
	private int payback_code = 0;
    private int sale_code = 0;
    private String member_id = null;
    private String goods_code = null;
    private int payback_price = 0;
    private int payback_count = 0;
    private String payback_date = null;
    public int getPayback_code() {
        return payback_code;
    }
    public void setPayback_code(int payback_code) {
        System.out.println("Payback dto payback_code : "+payback_code);
        this.payback_code = payback_code;
    }
    public int getSale_code() {
        return sale_code;
    }
    public void setSale_code(int sale_code) {
        System.out.println("Payback dto sale_code : "+sale_code);
        this.sale_code = sale_code;
    }
    public String getMember_id() {
        return member_id;
    }
    public void setMember_id(String member_id) {
        System.out.println("Payback dto member_id : "+member_id);
        this.member_id = member_id;
    }
    public String getGoods_code() {
        return goods_code;
    }
    public void setGoods_code(String goods_code) {
        System.out.println("Payback dto goods_code : "+goods_code);
        this.goods_code = goods_code;
    }
    public int getPayback_price() {
        return payback_price;
    }
    public void setPayback_price(int payback_price) {
        System.out.println("Payback dto payback_price : "+payback_price);
        this.payback_price = payback_price;
    }
    public int getPayback_count() {
        return payback_count;
    }
    public void setPayback_count(int payback_count) {
        System.out.println("Payback dto payback_count : "+payback_count);
        this.payback_count = payback_count;
    }
    public String getPayback_date() {
        return payback_date;
    }
    public void setPayback_date(String payback_date) {
        System.out.println("Payback dto payback_date : "+payback_date);
        this.payback_date = payback_date;
    }
}
