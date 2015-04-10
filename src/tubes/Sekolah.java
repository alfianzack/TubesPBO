/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tubes;

/**
 *
 * @author alfianzack
 */
public class Sekolah implements ViewtoString{
    private String namaSekolah;
    private Kelas kls;
    
    public Sekolah(String namaSekolah, String namaKelas){
        kls = new Kelas(namaKelas);
        this.namaSekolah = namaSekolah;
    }

    public void Sekolah() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }
    
    //Menampilkan Nama Sekolah dan kelasnya
    @Override
    public String toString(){
        return "Nama Sekolah : "+getNamaSekolah()+"\n"+kls.toString();
    }
}
