/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sepatu;


public class Merk {
    private String merk;
    private String warna;
     private int ukuran; 
     
     //konstruktor
     public Merk(){}
     
     //mutator
     public void setMerk (String merk) {
         this.merk = merk;
     }
     
      public void setWarna (String warna) {
         this.warna = warna;
     }
      
       public void setUkuran (int ukuran) {
         this.ukuran = ukuran;
     }
       
       //accessor
       public String getMerk (){
           return merk;
       }
       
       public String getWarna (){
           return warna;
       }
       
       public int getUkuran (){
           return ukuran;
       }
}
