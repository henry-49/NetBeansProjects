/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsapp;

public class Product {
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte [] picture;
    
    public Product(int pid, String pname, float pprice, String padDate, byte [] pimg) {
        this.id = id;
        this.name = pname;
        this.price = pprice;
        this.addDate = padDate;
        this.picture = pimg;
    }
    
    public int getId(){
        return  id;
    }
    
    public String getName(){
        return  name;
    }
    
    public float getPrice(){
        return price;
    }
    
    public String getAddDate(){
        return addDate;
    }
    
    public byte [] getImage(){
        return picture;
    }
}
