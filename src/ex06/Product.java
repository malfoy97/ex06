/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06;

/**
 *
 * @author g031o036
 */
public class Product {
    // フィールド
    private String product_name;
    private int purchase_price;
    private int selling_price;

    public Product() {
        product_name = "なし";
        purchase_price = 0;
        selling_price = 0;
    }
    
    public Product(String product_name, int purchase_price, int selling_price) {
    this.product_name = product_name;
    this.purchase_price = purchase_price;
    this.selling_price = selling_price;
    }
    
    public String getProduct_name() {
        return product_name;
    }

    // 各アクセッサ
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(int purchase_price) {
        this.purchase_price = purchase_price;
    }

    public int getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(int selling_price) {
        this.selling_price = selling_price;
    }
    
    
    // 利益を求めるメソッド
    public double profits(int p, int s) {
        s = s - p;
        return s;
}
}
