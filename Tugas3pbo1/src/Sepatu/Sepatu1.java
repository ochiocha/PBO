/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sepatu;


public class Sepatu1 {
    public static void main (String[] args) {
        Merk sepatu1 = new Merk();
        
        sepatu1.setMerk("Adidas");
        sepatu1.setWarna("putih");
        sepatu1.setUkuran(39);
        
        System.out.println("Merk sepatu:" + sepatu1.getMerk());
        System.out.println("Warna sepatu:" + sepatu1.getWarna());
        System.out.println("Ukuran sepatu:" + sepatu1.getUkuran());
    }
}
