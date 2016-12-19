package dto;

public class Cart {
	private int cart_num = 0;
    private String goods_name = null;
    private int sale_price = 0;
    private int cart_count = 0;
    private String goods_color = null;
    private String goods_brand = null;
    private int goods_size = 0;
    public int getCart_num() {
        return cart_num;
    }
    public void setCart_num(int cart_num) {
        System.out.println("Cart dto cart_num : "+cart_num);
        this.cart_num = cart_num;
    }
    public String getGoods_name() {
        return goods_name;
    }
    public void setGoods_name(String goods_name) {
        System.out.println("Cart dto goods_name : "+goods_name);
        this.goods_name = goods_name;
    }
    public int getSale_price() {
        return sale_price;
    }
    public void setSale_price(int sale_price) {
        System.out.println("Cart dto sale_price : "+sale_price);
        this.sale_price = sale_price;
    }
    public int getCart_count() {
        return cart_count;
    }
    public void setCart_count(int cart_count) {
        System.out.println("Cart dto cart_count : "+cart_count);
        this.cart_count = cart_count;
    }
    public String getGoods_color() {
        return goods_color;
    }
    public void setGoods_color(String goods_color) {
        System.out.println("Cart dto goods_color : "+goods_color);
        this.goods_color = goods_color;
    }
    public String getGoods_brand() {
        return goods_brand;
    }
    public void setGoods_brand(String goods_brand) {
        System.out.println("Cart dto goods_brand : "+goods_brand);
        this.goods_brand = goods_brand;
    }
    public int getGoods_size() {
        return goods_size;
    }
    public void setGoods_size(int goods_size) {
        System.out.println("Cart dto goods_size : "+goods_size);
        this.goods_size = goods_size;
    }
}
