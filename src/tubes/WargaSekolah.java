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
public class WargaSekolah implements ViewtoString{

       private String nama;

    /**
     * constructor
     * @param nama mengeset nama
     */
    public WargaSekolah(String nama) {
        this.nama = nama;
    }

    /**
     * method mengembalikan nama
     *
     * @return String nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * method menampilkan nama
     *
     * @return nama
     */
    public String toString() {
        return "Nama : " + getNama();
    }

}
