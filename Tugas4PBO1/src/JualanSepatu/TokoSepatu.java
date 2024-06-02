/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JualanSepatu;


public class TokoSepatu {
    public static void main(String[] args) {
        Sepatu[] sepatuDiToko = new Sepatu[4];
        
        sepatuDiToko[0] = new SepatuOlahraga("Adidas", 42, 1200000, "Lari");
        sepatuDiToko[1] = new SepatuOlahraga("Nike", 40, 1500000, "Basket");
        sepatuDiToko[2] = new SepatuFormal("Gucci", 43, 2500000, "Kulit");
        sepatuDiToko[3] = new SepatuFormal("Louis Vuitton", 41, 3000000, "Kulit Premium");
        
        for (Sepatu sepatu : sepatuDiToko) {
            System.out.println(sepatu.getDeskripsi());
        }
    }
}
