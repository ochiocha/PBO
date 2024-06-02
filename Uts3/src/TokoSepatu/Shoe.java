/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoSepatu;

/**
 *
 * @author User
 */
public class Shoe {
    //Atribut (Encapsulation)
    private String brand;
    private double size;
    private double price;
    
    //Kontruktor
    public Shoe (String brand, double size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }
    
    //Accessor methods (getter)
    public String getBrand() {
        return brand;
    }
    
    public double getSize() {
        return size;
    }
    
    public double getPrice() {
        return price;
    }
    
    //mutator methods (setter)
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
     public void setSize(double size) {
        this.size = size;
    }
     
     public void setPrice(double price) {
        this.price = price;
    }
     
     // Methods untuk menampilkan informasi sepatu
     public void displayInfo() {
         System.out.println("Brand: " + brand + ", Size: " + size + ", Price: " + price);
     }
}
