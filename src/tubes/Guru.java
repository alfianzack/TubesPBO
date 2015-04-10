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
public class Guru extends WargaSekolah implements ViewtoString {

    private String nip;
    private Siswa[] daftarSiswa = new Siswa[3];//array siswa yang dianajar oleh guru
    private int uas, uts, kuis, tugas;
    private int nSiswa = 0;


    public Guru(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void addSiswa(Siswa s) {
        daftarSiswa[nSiswa] = s;
        nSiswa++;
    }

    public void setNilai(String nama, String mapel, int uts, int uas, int kuis, int tugas) {
        int i = 0;
        while (i != nSiswa) {
            if (daftarSiswa[i].getNama().equals(nama)) {
                daftarSiswa[i].setNilai(mapel, uts, uas, kuis, tugas);
            }
            i++;
        }
    }
    
    public String viewSiswa(){
        int i = 0;
        String temp = "";
        while (i!=nSiswa){
            temp += daftarSiswa[i].toString()+"\n";
            i++;
        }
        return temp;
    }
    
    public String viewNilai(){
        int i = 0;
        String temp = "";
        while (i!=nSiswa){
            temp += daftarSiswa[i].getNama()+" \n" + daftarSiswa[i].viewMapel()+"\n";
            i++;
        }
        return temp;
    }

    public String toString() {
        return super.toString() + "\nNIP : " + getNip();
    }
}
