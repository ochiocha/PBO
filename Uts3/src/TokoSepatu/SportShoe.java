/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoSepatu;

public class SportShoe extends Shoe {
    //Atribut tambahan
    private String sportType;
    
    //Konstruktor
    public SportShoe(String brand, double size, double price, String sportType) {
        super(brand, size, price);
        this.sportType = sportType;
    }
    
    //Accessor dan mutator
    public String getSportType() {
        return sportType:
    }
    
    public void setSportType (String sportType) {
        this.sportType = sportType;
    }
    
    // Overriding method displayInfo untuk menampilkan informasi tambahan
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sport Type: " + sportType );
    }
}
