/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Eriza
 */
public class Aplikasi {

    private static Scanner s = new Scanner(System.in);
    private static int pil;

    /**
     */
    public static void mainMenu() {
        System.out.println("0. EXIT");
        System.out.println("1. Guru ");
        System.out.println("2. Siswa ");
        System.out.print("Pilih menu : ");
    }

    public static void menuSiswa() {
        do {
            System.out.println("MENU SISWA");
            System.out.println("1. Tambah Mapel");
            System.out.println("2. Lihat Nilai");
            System.out.println("3. EXIT");
            System.out.print("Pilih Menu : ");
            pil = s.nextInt();
            if (pil >= 4) {
                System.out.println("Menu tidak ada, Ulangi lagi");
            }
        } while (pil != 3);
    }

    public static void menuGuru() {
        do {
            System.out.println("MENU GURU");
            System.out.println("1. Input nilai");
            System.out.println("2. Tambah siswa ke dalam kelas");
            System.out.println("3. Daftar siswa");
            System.out.println("4. Daftar nilai siswa");
            System.out.println("5. EXIT");
            System.out.print("Pilih Menu : ");
            pil = s.nextInt();
            if (pil > 5) {
                System.out.println("Menu tidak ada, Ulangi lagi");
            }
        } while (pil != 5);
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
                System.out.println("Menu tidak ada, Ulangi lagi");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input salah");
        } finally {
            s = new Scanner(System.in);
        }
        return pil;
    }

    public static void main(String[] args) {
//        Siswa s1 = new Siswa("Jajal", "012992");
//        Siswa s2 = new Siswa("Tset2", "921993");
//        Kelas k1 = new Kelas();
//
//        Mapel m1 = new Mapel("Fisika");
//        Mapel m2 = new Mapel("Kalkulus");
//        Mapel m3 = new Mapel("Sejarah");
//        k1.addSiswa(s1);
//        k1.addSiswa(s2);
//        k1.addSiswa(s3);
//        k1.addSiswa(s4);
//        s1.ambilMapel(m1);
//        s1.ambilMapel(m2);
        Sekolah sklh = new Sekolah();
        sklh.setNamaSekolah("SMA Negeri Bandung");
        try {
            do {
                System.out.println(sklh.getNamaSekolah());
                mainMenu();
                inputPilihan();
            } while (pil != 0);
            System.out.println("Terima Kasih");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
