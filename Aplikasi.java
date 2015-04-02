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
    public static void menuSiswa() {

    }

    public static void menuGuru() {

    }

    public static int inputPilihan() {
        try {
            pil = s.nextInt();
            if ((pil >= 1) && (pil <= 2)) {
                switch (pil) {
                    case 1:
                        menuGuru();
                    case 2:
                        menuSiswa();
                }
            } else if (pil > 2) {
                throw new RuntimeException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Input salah");
        } catch (RuntimeException e) {
            System.out.println("Pilih 0 - 2, Ulangi lagi");
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
//        k1.addSiswa(s1);
//        k1.addSiswa(s2);
//        System.out.println(k1.getJumlahSiswa());
        try {
            do {
                System.out.println("0. EXIT");
                System.out.println("1. Guru ");
                System.out.println("2. Siswa ");
                System.out.print("Pilih menu : ");
                inputPilihan();
            } while (pil != 0);
            System.out.println("Terima Kasih");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
