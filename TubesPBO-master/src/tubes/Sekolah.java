/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Kelompok 6
 */
public class Sekolah implements ViewtoString {
/**
 * variable nama sekolah yang bertipe String 
 * variable kls yang bertipe Kelas
 */
    private String namaSekolah;
    private Kelas kls;
/**
 * 
 * @param namaSekolah
 * @param namaKelas
 * menginisialisasikan namasekolah dan nama kelas
 */
    public Sekolah(String namaSekolah, String namaKelas) {
        kls = new Kelas(namaKelas);
        this.namaSekolah = namaSekolah;
    }
/**
 * 
 * @return 
 * mengembailkan nilai nama sekolah
 */
    public String getNamaSekolah() {
        return namaSekolah;
    }
/**
 * menginisialisasikan naa sekolah
 * @param namaSekolah 
 */
    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }
/**
 * mengembailikan informasi nama sekolah
 * @return 
 */
    @Override
    public String toString() {
        return "Nama Sekolah : " + getNamaSekolah() + "\n" + kls.toString();
    }
}
