/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoSepatu;

public class Main {
   public static void main (String[] args) {
       //Membuat objek Shoe
       Shoe shoe = new Shoe("Generic", 42, 99.99);
       shoe.displayInfo();
   
   
       //Membuat objek SportShoe
       SportShoe sportShoe = new SportShoe("Nike", 43, 199.99, "Running");
       sportShoe.displayInfo();
   
    
       //Membuat objek SportShoe
       FormalShoe formalShoe = new FormalShoe("Claraks", 41, 149.99, "Leather");
       formalShoe.displayInfo();

       //Demonstrasi polymorphism
       Shoe polyShoe;

       polyShoe = sportShoe;
       polyShoe.displayInfo();

       polyShoe = formalShoe;
       polyShoe.displayInfo();
    }
    
}
