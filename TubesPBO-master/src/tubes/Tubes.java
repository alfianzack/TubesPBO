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
 * @author Kelompok 6
 */
public class Tubes {

    /**
     * @param args the command line arguments
     */
    private static Scanner s = new Scanner(System.in);
    private static int pil;

    public static void mainMenu() {
        System.out.println("=============");
        System.out.println("Menu Utama");
        System.out.println("0. EXIT");
        System.out.println("1. Guru ");
        System.out.println("2. Siswa ");
        System.out.print("Pilih menu : ");

    }


    public static void main(String args[]) {
        Sekolah sch = new Sekolah("SMA Negeri Bandung", "if3706");
        Aplikasi a = new Aplikasi();
        
        Guru g = new Guru("Albert, ","20-01-2021");
        MenuUtama m = new MenuUtama();
        m.setModel(g);
        m.setVisible(true);
        
        
        try {
            do {
                System.out.println(sch.getNamaSekolah());
                mainMenu();
                try {
                    pil = s.nextInt();
                    switch (pil) {
                        case 1:
                            a.menuGuru();
                            break;
                        case 2:
                            a.menuSiswa();
                            break;
                    }
                    if (pil > 2) {
                        System.out.println("Menu tidak ada, coba lagi");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input salah");
                } finally {
                    s = new Scanner(System.in);
                }
            } while (pil != 0);
            System.out.println("Terima Kasih");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
