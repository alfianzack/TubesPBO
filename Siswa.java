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
public class Siswa extends WargaSekolah {

    private String nis;
    /**
     * membuat array mapel yang dibatasi 3 mapel saja yang diambil
     */
    private Mapel m[] = new Mapel[3];//mapel yang diambil oleh siswa
    /**
     * inisialisasi jumlah mapel yang akan diambil
     */
    private int nMapel = 0;

    public Siswa(String nama, String nis) {
        super(nama);
        this.nis = nis;
    }

    /**
     * method mendapatkan Nomor Siswa
     *
     * @return String Nomor Siswa
     */
    public String getNis() {
        return "\nNis : " + nis;
    }

    /**
     * method untuk mengambil mapel
     *
     * @param m akan masuk kedalam array apabila melebihi kapasitas array akan
     * melempar exception
     */
    public void ambilMapel(Mapel m) {
        try {
            this.m[nMapel] = m;
            this.nMapel++;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Jumlah mapel melebihi");

        }

    }

    /**
     * method untuk menampilkan semua nilai . inisialisasi nilai 0
     */

    public void lihatNilai() {
        int i = 0;
        System.out.println("Daftar Mapel ");
        while (i != nMapel) {
            System.out.println(m[i].toString() + "\n");
            i++;
        }
    }

    /**
     * method menampilkan isi dari siswa
     *
     * @return menampilkan nama dan nomor siswa
     */

    public String toString() {
        return super.toString() + getNis();
    }
}
