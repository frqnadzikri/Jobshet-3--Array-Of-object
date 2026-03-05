package Praktikum03;

import java.util.Scanner;

public class DosenDemo14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dosen14[] arrayDosen = new Dosen14[3];

        for (int i = 0; i < 3; i++) {

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode : ");
            String kode = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=Pria, false=Wanita) : ");
            boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();

            System.out.println("-----------------------------");

            arrayDosen[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }

        int no = 1;

        for (Dosen14 d : arrayDosen) {

            System.out.println("Data Dosen ke-" + no);

            System.out.println("Kode : " + d.kode);
            System.out.println("Nama : " + d.nama);

            if (d.jenisKelamin) {
                System.out.println("Jenis Kelamin : Pria");
            } else {
                System.out.println("Jenis Kelamin : Wanita");
            }

            System.out.println("Usia : " + d.usia);
            System.out.println("-----------------------------");

            no++;
        }
    }
}