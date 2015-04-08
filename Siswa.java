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
public class Siswa extends WargaSekolah implements ViewString{

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
        try {
            this.m[nMapel] = m;
            this.nMapel++;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Jumlah mapel melebihi");

        }

    }

    //Jumlah mepel yang diambil
    public int getJumlahMapel(){
        return nMapel;
    }
    //Daftar mapel yang diambil
    public String viewMapel(){
        viewPel ="";
        for (int count=0; count<nMapel;count++){
            int i = count+1;
            viewPel = viewPel +" "+i+". "+mapel[count]+"\n";
        }
        return viewPel;
    }
        public void setKuis(String s, int n){
        int i=0;
        while(i!=nMapel){
            if (m[i].getNamaMapel().equals(s)){
                m[i].setKuis(n);
            }
            i++;
        }
    }

    /**
     * method menampilkan isi dari siswa
     *
     * @return menampilkan nama, nomor siswa, jumlah mapel yang diambil dan daftar mapel
     */
    public String toString() {
        return super.toString() + "\nNIS : "+getNis()+"\nJumlah Mapel yang diambil : "+getJumlahMapel()+"\nMapel : \n"+viewMapel();
    }
}
