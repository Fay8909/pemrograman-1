package Tugas;

import java.util.Scanner;

public class tugas_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== HARI 1 =====
        System.out.println("\n==== Hari 1 ====");
        System.out.print("Makan: ");
        int makan1 = input.nextInt();
        System.out.print("Transport: ");
        int transport1 = input.nextInt();
        System.out.print("Belanja: ");
        int belanja1 = input.nextInt();

        // ===== HARI 2 =====
        System.out.println("\n==== Hari 2 ====");
        System.out.print("Makan: ");
        int makan2 = input.nextInt();
        System.out.print("Transport: ");
        int transport2 = input.nextInt();
        System.out.print("Belanja: ");
        int belanja2 = input.nextInt();

        // ===== HARI 3 =====
        System.out.println("\n==== Hari 3 ====");
        System.out.print("Makan: ");
        int makan3 = input.nextInt();
        System.out.print("Transport: ");
        int transport3 = input.nextInt();
        System.out.print("Belanja: ");
        int belanja3 = input.nextInt();

        // ===== HARI 4 =====
        System.out.println("\n==== Hari 4 ====");
        System.out.print("Makan: ");
        int makan4 = input.nextInt();
        System.out.print("Transport: ");
        int transport4 = input.nextInt();
        System.out.print("Belanja: ");
        int belanja4 = input.nextInt();

        // ===== HARI 5 =====
        System.out.println("\n==== Hari 5 ====");
        System.out.print("Makan: ");
        int makan5 = input.nextInt();
        System.out.print("Transport: ");
        int transport5 = input.nextInt();
        System.out.print("Belanja: ");
        int belanja5 = input.nextInt();

        // ===== HARI 6 =====
        System.out.println("\n==== Hari 6 ====");
        System.out.print("Makan: ");
        int makan6 = input.nextInt();
        System.out.print("Transport: ");
        int transport6 = input.nextInt();
        System.out.print("Belanja: ");
        int belanja6 = input.nextInt();

        // ===== HARI 7 =====
        System.out.println("\n==== Hari 7 ====");
        System.out.print("Makan: ");
        int makan7 = input.nextInt();
        System.out.print("Transport: ");
        int transport7 = input.nextInt();
        System.out.print("Belanja: ");
        int belanja7 = input.nextInt();

        // ===== AKUMULASI =====
        int totalMakan = makan1 + makan2 + makan3 + makan4 + makan5 + makan6 + makan7;
        int totalTransport = transport1 + transport2 + transport3 + transport4 + transport5 + transport6 + transport7;
        int totalBelanja = belanja1 + belanja2 + belanja3 + belanja4 + belanja5 + belanja6 + belanja7;

        int totalSemua = totalMakan + totalTransport + totalBelanja;

        // ===== PERSENTASE =====
        double persenMakan = (double) totalMakan / totalSemua * 100;
        double persenTransport = (double) totalTransport / totalSemua * 100;
        double persenBelanja = (double) totalBelanja / totalSemua * 100;

        // ===== OUTPUT =====
        System.out.println("\n=== Rekap 7 Hari ===");
        System.out.println("Total Pengeluaran: " + totalSemua);

        System.out.println("Persen Makan: " + persenMakan + " %");
        System.out.println("Persen Transport: " + persenTransport + " %");
        System.out.println("Persen Belanja: " + persenBelanja + " %");

        input.close();
    }
}


//Prototype Tugas
// package Tugas;

// import java.util.Scanner;

// public class tugas_1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // int budget = 80000;

//         System.out.print("\nMasukkan pengeluaran makan: ");
//         int makan = input.nextInt();

//         System.out.print("Masukkan pengeluaran transport: ");
//         int transport = input.nextInt();

//         System.out.print("Masukkan pengeluaran belanja: ");
//         int belanja = input.nextInt();

//         int total = makan + transport + belanja;

//         // Persentase per kategori (dari total)
//         double persenMakan = (double) makan / total * 100;
//         double persenTransport = (double) transport / total * 100;
//         double persenBelanja = (double) belanja / total * 100;

//         // // Persentase terhadap budget
//         // double persenBudget = (double) total / budget * 100;

//         // Output
//         System.out.println("\n=== Hasil ===");
//         System.out.println("Total Pengeluaran: " + total);

//         System.out.println("Persen Makan: " + persenMakan + "%");
//         System.out.println("Persen Transport: " + persenTransport + "%");
//         System.out.println("Persen Belanja: " + persenBelanja + "%");

//         // System.out.println("Pemakaian Budget: " + persenBudget + "%");

//         input.close();
//     }
// }
