package Tugas;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String nama = "", karir = "",umum = "";
        System.out.println("Masukan Nama Anda: ");
        nama = input.nextLine();
        System.out.println("\n=== PILIH BIDANG IT ===");
        System.out.println("1. Web Developer");
        System.out.println("2. Cyber Security / Jaringan");
        System.out.println("Default: IT Support");
        System.out.print("Masukkan pilihan: ");

        int pilihan = input.nextInt();

        // IF 1: Web Developer
        if (pilihan >= 1 && pilihan <= 2) {
            System.out.println("\nPilih spesialisasi:");
            System.out.println("1. Front-End");
            System.out.println("2. Back-End");
            System.out.print("Masukkan pilihan: ");

            int web = input.nextInt();

            switch (web) {
                case 1:
                    karir = "\nKamu memilih Front-End Developer";
                    break;
                case 2:
                    karir = "\nKamu memilih Back-End Developer";
                    break;
                default:
                    karir = "\nPilihan tidak valid.";
            }

        // IF 2: Cyber Security / Jaringan
        } else if (pilihan >= 1 && pilihan <= 2) {
            System.out.println("\nPilih bidang:");
            System.out.println("1. Cyber Security");
            System.out.println("2. Maintenance Jaringan");
            System.out.print("Masukkan pilihan: ");

            int cyber = input.nextInt();

            switch (cyber) {
                case 1:
                    karir = "\nKamu memilih Cyber Security";
                    break;
                case 2:
                    karir = "\nKamu memilih Maintenance Jaringan";
                    break;
                default:
                    karir = "\nPilihan tidak valid.";
            }

        // IF 3: IT Support
        } else {
            umum = "\nBidang IT Support\nPeran: Help Desk\nTugas: Membantu troubleshooting user dan sistem";

        }


        System.out.println("\n===============================");
        System.out.println("Nama: " + nama);
        System.out.println("Jalan Karir: " + karir + umum);
        System.out.println("===============================");
        input.close();
    }
}