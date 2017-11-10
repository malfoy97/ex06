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
public class Daily_necessarie extends Product {
    private String manufacturer;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    
    public Daily_necessarie(String product_name, int purchase_price, int selling_price, String manufacturer) {
        super(product_name,purchase_price, selling_price);
        this.manufacturer = manufacturer;
    }
    
}
