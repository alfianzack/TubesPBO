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
public class Tubes {

    /**
     * @param args the command line arguments
     */
    private static Scanner s = new Scanner(System.in);
    private static int pil;
    private static int pilguru;
    private static int pilsiswa;
    private static int menus;

    public static void mainMenu() {

        System.out.println("menu utama");
        System.out.println("0. EXIT");
        System.out.println("1. Guru ");
        System.out.println("2. Siswa ");
        System.out.print("Pilih menu : ");

    }

    public static void menuSiswa() {
        Siswa s1 = new Siswa("bagus", "11");
        Mapel m1 = new Mapel("Fisika");
        Mapel m2 = new Mapel("Biologi");
        Mapel m3 = new Mapel("Kimia");

        do {

            System.out.println("MENU SISWA");
            System.out.println("1. Tambah Mapel");
            System.out.println("2. Lihat Nilai");
            System.out.println("3. EXIT");
            System.out.print("Pilih Menu : ");
            pilsiswa = s.nextInt();

            switch (pilsiswa) {
                case 1:
                    System.out.println("daftar mata pelajaran ");
                    System.out.println("1.Fisika");
                    System.out.println("2.Biologi");
                    System.out.println("3.Kimia");
                    System.out.println("Masukkan mata pelajaran : ");
                    menus = s.nextInt();
                    if (menus == 1) {
                        s1.ambilMapel(m1);
                    } else if (menus == 2) {
                        s1.ambilMapel(m2);
                    } else if (menus == 3) {
                        s1.ambilMapel(m3);
                    } else {
                        System.out.println("tidak ada mapel ");
                    }
                    System.out.println(s1.toString());
                    break;

                case 2:
                    System.out.println(s1.viewMapel());
                    break;

            }
            if (pilsiswa >= 4) {
                System.out.println("Menu tidak ada, Ulangi lagi");
            }
        } while (pilsiswa != 3);
    }

    public static void menuGuru() {
        Scanner ina = new Scanner(System.in);
        String nama = null;
        String mapel = null;
        String nis = null;
        int uts, uas, kuis, tugas = 0;
        Guru g = new Guru("dasa", "213");
        Siswa s1 = new Siswa("bagus", "11");
        Mapel m1 = new Mapel("Fisika");
        s1.ambilMapel(m1);
        g.addSiswa(s1);
        Siswa tempsiswa;

        do {
            System.out.println("MENU GURU");
            System.out.println("1. Input nilai");
            System.out.println("2. Tambah siswa ke dalam kelas");
            System.out.println("3. Daftar siswa");
            System.out.println("4. Daftar nilai siswa");
            System.out.println("5. EXIT");
            System.out.print("Pilih Menu : ");
            pilguru = s.nextInt();
            switch (pilguru) {
                case 1:
                    System.out.println("Nama siswa ");
                    nama = ina.nextLine();
                    System.out.println("Mata Pelajaran ");
                    mapel = ina.nextLine();
                    System.out.println("uts : ");
                    uts = s.nextInt();
                    System.out.println("uas : ");
                    uas = s.nextInt();
                    System.out.println("kuis : ");
                    kuis = s.nextInt();
                    System.out.println("tugas : ");
                    tugas = s.nextInt();
                    g.setNilai(nama, mapel, uts, uas, kuis, tugas);

                    break;
                case 2:
                    System.out.println("Nama siswa : ");
                    nama = ina.nextLine();
                    System.out.println("NIS : ");
                    nis = ina.nextLine();
                    tempsiswa = new Siswa(nama,nis);
                    g.addSiswa(tempsiswa);
                    break;
                case 3:
                    System.out.println("Daftar Siswa ");
                    System.out.println(g.viewSiswa());
                    break;
                case 4 : 
                    System.out.println("Daftar Nilai");
                    System.out.println(g.viewNilai());
                    break;

            }
            if (pilguru > 5) {
                System.out.println("Menu tidak ada, Ulangi lagi");
            }
        } while (pilguru != 5);
    }

    public static int inputPilihan() {
        try {
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    menuGuru();
                    break;
                case 2:
                    menuSiswa();
                    break;
            }
            if (pil > 2) {
                System.out.println("Menu tidak ada,i");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input salah");
        } finally {
            s = new Scanner(System.in);
        }
        return pil;
    }

    public static void main(String args[]) {
        Sekolah sch = new Sekolah("SMA Negeri", "if3706");

        try {
            do {
                System.out.println(sch.getNamaSekolah());
                mainMenu();
                inputPilihan();
            } while (pil != 0);
            System.out.println("Terima Kasih");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
