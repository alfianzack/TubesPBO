/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eriza
 */
public class Sekolah {
    private String namaSekolah;
    private Kelas kls;
    
    public Sekolah(String namaSekolah, String namaKelas){
        kls = new Kelas(namaKelas);
        this.namaSekolah = namaSekolah;
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
