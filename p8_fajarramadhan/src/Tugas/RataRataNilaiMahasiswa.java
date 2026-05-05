package Tugas;
import java.util.Scanner;

public class RataRataNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai, total = 0, jumlahMhs = 0;
        char pilihan;

        do {
            System.out.print("\nMasukkan nilai mahasiswa: ");
            nilai = input.nextInt();

            total += nilai;
            jumlahMhs++;

            System.out.print("Input nilai lagi? (y/t): ");
            pilihan = input.next().charAt(0);

        } while (pilihan != 't');

        double rataRata = (double) total / jumlahMhs;

        System.out.println("\nTotal nilai: " + total);
        System.out.println("Jumlah data: " + jumlahMhs);
        System.out.println("Rata-rata nilai: " + rataRata);
        input.close();
    }
}