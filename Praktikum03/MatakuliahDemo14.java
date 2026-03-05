package Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MataKuliah14[] arrayOfMatakuliah = new MataKuliah14[jumlah];

        for (int i = 0; i < jumlah; i++) {

            arrayOfMatakuliah[i] = new MataKuliah14();

            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            System.out.print("Kode       : ");
            String kode = sc.nextLine();

            System.out.print("Nama       : ");
            String nama = sc.nextLine();

            System.out.print("SKS        : ");
            int sks = sc.nextInt();

            System.out.print("Jumlah Jam : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine();

            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\nData Matakuliah:");

        for (int i = 0; i < jumlah; i++) {
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}