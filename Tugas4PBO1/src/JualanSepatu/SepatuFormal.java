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
class SepatuFormal extends Sepatu{
    private String bahan;

    public SepatuFormal(String merk, int ukuran, int harga, String bahan) {
        super(merk, ukuran, harga);
        this.bahan = bahan;
    }
    
    public String getBahan(){
        return bahan;
    }
    
    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    
    @Override
    public String getDeskripsi () {
        return super.getDeskripsi() + ", Bahan:" + bahan;
    } 
}
