/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06;

import java.text.ParseException;

/**
 *
 * @author g031o036
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Daily_necessarie d1;
        Food f1;
        
        d1 = new Daily_necessarie("体温計", 900, 1200, "テルモ");
        System.out.println("商品名:"+d1.getProduct_name()+"\n"+"仕入価格"+d1.getPurchase_price()+"円"+"\n"+"販売価格:"+d1.getSelling_price()+"円"+"\n"
                +"製造元:"+d1.getManufacturer()+"\n"+"利益:"+d1.profits(d1.getPurchase_price(), d1.getSelling_price())+"円"+"\n");
        
        f1 = new Food("ポン・デ・リング", 90, 150, "17/11/19", 50);
        System.out.println("商品名:"+f1.getProduct_name()+"\n"+"仕入価格:"+f1.getPurchase_price()+"円"+"\n"+"販売価格:"+f1.getSelling_price()+"円"+"\n"
                +"賞味期限:"+f1.getBest_before()+"\n"+"販売数:"+f1.getSales()+Food.kosuu+"\n"+"1"+Food.kosuu+"あたりの利益:"+f1.profits(f1.getPurchase_price(), f1.getSelling_price())+"円");
                
    }
}
