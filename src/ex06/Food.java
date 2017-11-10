/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author g031o036
 */
public class Food extends Product {
    private SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
    private SimpleDateFormat sdf2 = new SimpleDateFormat("yy年MM月dd日");
    private Date best_before2;
    private String best_before;
    static String mg = "mg";
    static String ml = "ml";
    static String kosuu = "個";
    private int sales;
    
    public Food(String product_name, int purchase_price, int selling_price, String best_before, int sales){
        super(product_name, purchase_price, selling_price);
        this.best_before = best_before;
        this.sales = sales;
    }

    public String getBest_before() throws ParseException {
        best_before2 = sdf.parse(best_before);
        String dest = sdf2.format(best_before2);
        return dest;
    }

    public void setBest_before(String best_before) {
        this.best_before = best_before;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
    
    @Override
    public double profits(int p, int s) {
        return super.profits(p, s) / sales;
    }
}
