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
public class Guru extends WargaSekolah implements ViewtoString {

    private String nip;
    private Siswa[] daftarSiswa;//array siswa yang dianajar oleh guru
    private int uas, uts, kuis, tugas;
    private int nSiswa = 0;
/**
 * menginisiasikan nama dan nip dari guru
 * @param nama
 * @param nip 
 */
    public Guru(String nama, String nip) {
        super(nama);
        this.nip = nip;
        daftarSiswa = new Siswa[4];
    }
/**
 * mengembalikan nip dari guru
 * @return 
 */
    public String getNip() {
        return nip;
    }
/**
 * menambahkan siswa ke dalam kelas
 * @param s 
 */
    public void addSiswa(Siswa s) {
        daftarSiswa[nSiswa] = s;
        nSiswa++;
    }
/**
 * mengeset nilai tugas, uas, kuis, uts seorang siswa
 * @param nama
 * @param mapel
 * @param uts
 * @param uas
 * @param kuis
 * @param tugas 
 */
    public void setNilai(String nama, String mapel, int uts, int uas, int kuis, int tugas) {
        int i = 0;
        while (i != nSiswa) {
            if (daftarSiswa[i].getNama().equals(nama)) {
                daftarSiswa[i].setNilai(mapel, uts, uas, kuis, tugas);
            }
            i++;
        }
    }
/**
 * pencarian seorang siswa bedasarkan nama yang dicari
 * @param nama
 * @return 
 */
    public Siswa cariSiswa(String nama) {
        int i = 0;
        Siswa s = null;
        while (i != nSiswa) {
            if (daftarSiswa[i].getNama().equals(nama)) {
                s = daftarSiswa[i]; 
            }
            i++;
        }
        return s;
    }
/**
 * mengembalikan siswa yang yang ada di dalam kelas
 * @return 
 */
    public String viewSiswa() {
        int i = 0;
        String temp = "";
        while (i != nSiswa) {
            temp += "Nama : " + daftarSiswa[i].getNama() + "\n"
                    + "Nis :" + daftarSiswa[i].getNis() + "\n";
            i++;
        }
        return temp;
    }
/**
 * menampilkan nilai dari siswa
 * @return 
 */
    public String viewNilai() {
        int i = 0;
        String temp = "";
        while (i != nSiswa) {
            temp += daftarSiswa[i].getNama() + " \n" + daftarSiswa[i].viewMapel() + "\n";
            i++;
        }
        return temp;
    }
/**
 * 
 * @param nis
 * @return 
 */    
    public Siswa cekNis(String nis){
        Siswa a = null;
        int i=0;
        while(i!=nSiswa){
            if(nis.equals(daftarSiswa[i].getNis())){
                a = daftarSiswa[i];
            }
            i++;
        }
        return a;
    }
/**
 * menampilkan sebuah string dengan menambahkan nip dari guru
 * @return 
 */    
    public String toString() {
        return super.toString() + "\nNIP : " + getNip();
    }
}
