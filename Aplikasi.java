/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eriza
 */
public class Aplikasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sekolah s = new Sekolah("Test", "IF");
        System.out.println(s.toString());

        Siswa s1 = new Siswa("Jajal", "012992");
        Siswa s2 = new Siswa("Tset2", "921993");
        Kelas k1 = new Kelas();

        k1.addSiswa(s1);
        k1.addSiswa(s2);
        System.out.println(k1.getJumlahSiswa());
    }

}
