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
public class Siswa extends WargaSekolah implements ViewtoString {

    private String nis;
    /**
     * membuat array mapel yang dibatasi 3 mapel saja yang diambil
     */
    private Mapel m[] = new Mapel[2];//mapel yang diambil oleh siswa
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
        return nis;
    }

    /**
     * method untuk mengambil mapel
     *
     * @param m akan masuk kedalam array apabila melebihi kapasitas array akan
     * melempar exception
     */
    public void ambilMapel(Mapel m) {
        this.m[nMapel] = m;
        this.nMapel++;
        

    }
/**
 * jumlah mapel yang diambil
 * @return 
 */
    public int getJumlahMapel() {
        return nMapel;
    }
/**
 * Daftar mapel yang diambil
 * @return 
 */
    //Daftar mapel yang diambil
    public String viewMapel() {
        String viewPel = "";
        for (int count = 0; count < nMapel; count++) {
            int i = count + 1;
            viewPel +=i + ". " + m[count].toString() + "\n";
        }
        
        return viewPel;
    }
/**
 * menampilkan semua nilai siswa
 * @return 
 */    
    public String viewAllScore(){
        String viewAll="";
        for(int i=0;i<nMapel;i++){
            viewAll += "Mapel : "+m[i].getNamaMapel()
                        +"\nKuis : "+m[i].getKuis()
                        +"\nTugas : "+m[i].getTugas()
                        +"\nUTS : "+m[i].getUts()
                        +"\nUAS : "+m[i].getUas()
                        +"\nNilai total : "+m[i].getNilai()
                        +"\n===================\n";
        }
        return viewAll;
    }
 /**
  * pengecekan mepel yang diambil oleh siswa
  * @param nama
  * @return 
  */
    public Mapel cekMapel(String nama){
        int i=0;
        Mapel carim = null;
        while (i!=nMapel){
            if (m[i].getNamaMapel().equals(nama)) {
                carim = m[i];
            }
            i++;
        }
        return carim;
    }
/**
 * untuk meng-set nilai siswa dalam sebuah mapel
 * @param nama
 * @param uts
 * @param uas
 * @param kuis
 * @param tugas 
 */
    public void setNilai(String nama, int uts, int uas, int kuis, int tugas) {
        int i = 0;
        while (i != nMapel) {
            if (m[i].getNamaMapel().equals(nama)) {
                m[i].setNilai(uts, uas, kuis, tugas);
            }
            i++;
        }
    }
/**
 * menampilkan string yang berisi nis dan mapel
 * @return 
 */
    public String toString() {
        return super.toString() + "\nNIS : " + getNis() + "\nMapel : \n" + viewMapel();
    }

}
