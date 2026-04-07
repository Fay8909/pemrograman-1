package Latihan;

import java.util.Scanner;

public class latihan_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama; int usia;
        System.out.println("Nama: ");
        nama = input.nextLine();
        System.out.println("Masukan usia:");
        usia = input.nextInt();
        System.out.println("Nama: " + nama + " usia anda " + usia + " tahun");
        input.close();
    }
}