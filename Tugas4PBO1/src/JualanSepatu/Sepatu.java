/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JualanSepatu;

/**
 *
 * @author User
 */
public class Sepatu {
   private String merk;
   private int ukuran;
   private int harga;
   
   public Sepatu(String merk, int ukuran, int harga) {
       this.merk = merk;
       this.ukuran = ukuran;
       this.harga = harga;
   }
   
   public String getMerk(){
       return merk;
   }
   
   public void setMerk(String merk) {
       this.merk = merk;
   }
   
   public int getUkuran(){
       return ukuran;
   }    
   
   public void setUkuran(int ukuran) {
       this.ukuran = ukuran;
   }
   
   public int getHarga(){
       return harga;
   }    
   
    public void setHarga(int harga) {
       this.harga = harga;
   }
    
    public String getDeskripsi (){
        return "Merk: " + merk + ", Ukuran: " + ukuran + ", Harga: Rp " + harga;
    }
}
