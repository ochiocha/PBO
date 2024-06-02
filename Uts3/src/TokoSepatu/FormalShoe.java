/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoSepatu;

public class FormalShoe extends Shoe {
    //Atribut tambahan
    private String material;
    
    //Konstruktor
    public FormalShoe (String brand, double size, double price, String material) {
        super(brand, size, price);
        this. material = material;
    }
    
    //Accessor dan mutator
    public String getMaterial()  {
        return material ;
    }
    
    
    public void getMaterial (String material) {
        this.material = material;
    }
    
    //Overriding method displayInfo untuk menampilkan informasi tambahan
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Material : " + material);
    }
}
