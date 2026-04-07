package Latihan;

import java.util.Scanner;

public class latihan1{
    // Masukan 4 unsur penilaian kehadiran, tugas, uts, uas
    // buat variable realisasi untuk menentukan nilai dari kehadiran(sks = 21/14)

    public static void main(String[] args) {
        float kehadiran, tugas, uts, uas, realisasi;
    
        System.out.println("\n=================================");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jumlah kehadiran: ");
        kehadiran = input.nextFloat();

        System.out.println("Masukan Nilai realisasi: ");
        realisasi = input.nextFloat();

        System.out.println("Masukan nilai tugas: ");
        tugas = input.nextFloat();

        System.out.println("Masukan nilai UTS: ");
        uts  = input.nextFloat();

        System.out.println("Masukan nilai UAS: ");
        uas = input.nextFloat();
        input.close();
        System.out.println("\n=================================");

        float b_kehadiran,b_tugas,b_uts,b_uas, total;

        b_kehadiran = kehadiran/realisasi * 10;
        b_tugas = tugas * 20/100;
        b_uts = uts * 30/100;
        b_uas = uas * 40/100;
        total = b_kehadiran + b_tugas + b_uts + b_uas;
        
        System.out.println("\n=================================");
        System.out.println("Jumlah Kehadiran: " + kehadiran);
        System.out.println("Bobot Kehadiran: " + b_kehadiran);
        System.out.println("Nilai Tugas: " + tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("\nTotal: " + total);
        System.out.println("\n=================================");
    }
}
