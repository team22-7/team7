package dto;

public class Delivery {
	private int delivery_code = 0;
    private String member_id = null;
    private String goods_code = null;
    private String delivery_name = null;
    private String delivery_addr = null;
    private int delivery_phone = 0;
    private String member_name = null;
    private int member_phone = 0;
    private String member_addr = null;
    private String delivery_date = null;
    public int getDelivery_code() {
        return delivery_code;
    }
    public void setDelivery_code(int delivery_code) {
        System.out.println("Delivery dto delivery_code : "+delivery_code);
        this.delivery_code = delivery_code;
    }
    public String getMember_id() {
        return member_id;
    }
    public void setMember_id(String member_id) {
        System.out.println("Delivery dto member_id : "+member_id);
        this.member_id = member_id;
    }
    public String getGoods_code() {
        return goods_code;
    }
    public void setGoods_code(String goods_code) {
        System.out.println("Delivery dto goods_code : "+goods_code);
        this.goods_code = goods_code;
    }
    public String getDelivery_name() {
        return delivery_name;
    }
    public void setDelivery_name(String delivery_name) {
        System.out.println("Delivery dto delivery_name : "+delivery_name);
        this.delivery_name = delivery_name;
    }
    public String getDelivery_addr() {
        return delivery_addr;
    }
    public void setDelivery_addr(String delivery_addr) {
        System.out.println("Delivery dto delivery_addr : "+delivery_addr);
        this.delivery_addr = delivery_addr;
    }
    public int getDelivery_phone() {
        return delivery_phone;
    }
    public void setDelivery_phone(int delivery_phone) {
        System.out.println("Delivery dto delivery_phone : "+delivery_phone);
        this.delivery_phone = delivery_phone;
    }
    public String getMember_name() {
        return member_name;
    }
    public void setMember_name(String member_name) {
        System.out.println("Delivery dto member_name : "+member_name);
        this.member_name = member_name;
    }
    public int getMember_phone() {
        return member_phone;
    }
    public void setMember_phone(int member_phone) {
        System.out.println("Delivery dto member_phone : "+member_phone);
        this.member_phone = member_phone;
    }
    public String getMember_addr() {
        return member_addr;
    }
    public void setMember_addr(String member_addr) {
        System.out.println("Delivery dto member_addr : "+member_addr);
        this.member_addr = member_addr;
    }
    public String getDelivery_date() {
        return delivery_date;
    }
    public void setDelivery_date(String delivery_date) {
        System.out.println("Delivery dto delivery_date : "+delivery_date);
        this.delivery_date = delivery_date;
    }
}
