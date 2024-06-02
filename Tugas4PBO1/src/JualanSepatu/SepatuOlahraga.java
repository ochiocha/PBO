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
class SepatuOlahraga extends Sepatu{
    private String jenisOlahraga;

    public SepatuOlahraga(String merk, int ukuran, int harga, String jenisOlahraga) {
        super(merk, ukuran, harga);
        this.jenisOlahraga = jenisOlahraga;
    }
    
    public String getJenisOlahraga(){
        return jenisOlahraga;
    }
    
    public String getJenisOlahraga(String jenisOlahraga){
        this.jenisOlahraga = jenisOlahraga;
    }
    
    @Override
    public String getDeskripsi () {
        return super.getDeskripsi() + ", Jenis Olahraga:" + jenisOlahraga;
    } 
}
