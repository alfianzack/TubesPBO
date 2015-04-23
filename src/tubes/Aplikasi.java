/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alfianzack
 */
public class Aplikasi {

    private Scanner s = new Scanner(System.in);
    int pilsiswa;
    int menus;
    int pilguru;
    Scanner ina = new Scanner(System.in);
    String nama = null;
    String mapel = null;
    String nis = null;
    int uts, uas, kuis, tugas = 0;
    Guru g = new Guru("Dasa", "213");
    Siswa s1 = new Siswa("bagus", "1");
    Mapel m1 = new Mapel("fisika");
    Mapel m2 = new Mapel("biologi");
    Mapel m3 = new Mapel("kimia");
    Mapel m = null;
    Siswa tempsiswa;

    public void login() {

    }

    public void menuSiswa() {

        Siswa sBaru = null;
        g.addSiswa(s1);
        System.out.print("Masukkan nama :");
        nama = ina.nextLine();
        sBaru = g.cariSiswa(nama);
        if (sBaru != null) {

            do {
                System.out.println("======================");
                System.out.println("MENU SISWA");
                System.out.println("0. EXIT");
                System.out.println("1. Tambah Mapel");
                System.out.println("2. Lihat Nilai");
                System.out.print("Pilih Menu : ");
                pilsiswa = s.nextInt();

                switch (pilsiswa) {
                    case 1:
                        System.out.println("daftar mata pelajaran ");
                        System.out.println("1.Fisika");
                        System.out.println("2.Biologi");
                        System.out.println("3.Kimia");
                        System.out.print("Masukkan mata pelajaran : ");
                        try {
                            menus = Integer.parseInt(ina.nextLine());
                            if (menus == 1) {
                                m = m1;
                            } else if (menus == 2) {
                                m = m2;
                            } else if (menus == 3) {
                                m = m3;
                            }
                            sBaru.ambilMapel(m);
                            System.out.println(sBaru.toString());
                            System.out.println("Input Sukses");
                        } catch (NullPointerException e) {
                            System.out.println("Tidak ada mapel, coba lagi");
                        } catch (NumberFormatException e) {
                            System.out.println("Input salah, coba lagi");
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Mapel melebihi");
                        }

                        break;

                    case 2:
                        try {
                            System.out.println(sBaru.viewMapel());
                        } catch (NullPointerException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                }
                if (pilsiswa > 2) {
                    System.out.println("Menu tidak ada, Ulangi lagi");
                }
            } while (pilsiswa != 0);
        } else {
            System.out.println("Tidak ada mahasiswa");
        }

    }

    public void menuGuru() {
        Siswa sBaru = null;
        Mapel tempMapel = null;

        do {
            System.out.println("====================");
            System.out.println("MENU GURU");
            System.out.println("0. EXIT");
            System.out.println("1. Input nilai");
            System.out.println("2. Tambah siswa ke dalam kelas");
            System.out.println("3. Daftar siswa");
            System.out.println("4. Daftar nilai siswa");
            System.out.print("Pilih Menu : ");

            pilguru = s.nextInt();
            switch (pilguru) {
                case 1:
                    try {
                        System.out.print("Nama Siswa : ");
                        nama = ina.nextLine();
                        sBaru = g.cariSiswa(nama);
                        if (sBaru==null){
                            throw new NullPointerException("Tidak ada data siswa");
                        }
                        System.out.print("Mata Pelajaran : ");
                        mapel = ina.nextLine();
                        tempMapel = sBaru.cekMapel(mapel);
                        if(tempMapel==null){
                            throw new NullPointerException("Siswa belum input mata pelajaran");
                        }
                        
                        System.out.print("uts : ");
                        uts = s.nextInt();
                        System.out.print("uas : ");
                        uas = s.nextInt();
                        System.out.print("kuis : ");
                        kuis = s.nextInt();
                        System.out.print("tugas : ");
                        tugas = s.nextInt();

                        g.setNilai(nama, mapel, uts, uas, kuis, tugas);
                    
                    } catch (InputMismatchException e) {
                        System.out.println("Salah input");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Nama siswa : ");
                    nama = ina.nextLine();
                    System.out.print("NIS : ");
                    nis = ina.nextLine();
                    Siswa tesNis = g.cekNis(nis);
                    if (tesNis == null) {
                        tempsiswa = new Siswa(nama, nis);
                        g.addSiswa(tempsiswa);
                        System.out.println("Input sukses");
                    } else {
                        System.out.println("Sudah ada NIS tersebut\nNama " + tesNis.getNama() + "\nNIS " + tesNis.getNis());
                        System.out.println("Input gagal");
                    }
                    break;
                case 3:
                    System.out.println("Daftar Siswa ");
                    System.out.println(g.viewSiswa());
                    break;
                case 4:
                    System.out.println("Daftar Nilai");
                    System.out.println(g.viewNilai());
                    break;

            }

            if (pilguru > 4) {
                System.out.println("Menu tidak ada, Ulangi lagi");
            }
        } while (pilguru != 0);

    }
}
