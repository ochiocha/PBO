/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textmotor;

/**
 *
 * @author User
 */
public class MerkMotor {
    public static void main (String[] args) {
        Merk merk1=new Merk();
        merk1.nama="Honda";
        merk1.tahun=2019; 
        merk1.jenis="Pcx"; 
        System.out.println("nama:"+ merk1.nama);
        System.out.println("tahun:"+ merk1.tahun);
        System.out.println("jenis:"+ merk1.jenis);
        
        Merk merk2=new Merk();
        merk2.nama="Yamaha";
        merk2.tahun=2021; 
        merk2.jenis="Nmax"; 
        System.out.println("nama:"+ merk2.nama);
        System.out.println("tahun:"+ merk2.tahun);
        System.out.println("jenis:"+ merk2.jenis);
    }
}
