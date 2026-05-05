package Tugas;
import java.util.Scanner;

public class MenghitungJumlahNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai, total = 0;
        char pilihan;

        do {
            System.out.print("\nMasukan Nilai Mahasiswa: ");
            nilai = input.nextInt();

            total += nilai;

            System.out.print("Masukan Nilai lagi?\n(y/t): ");
            pilihan = input.next().charAt(0);
        } while (pilihan != 't');

        System.out.println("\nTotal Nilai Mahasiswa: " + total);
        input.close();
    }
}
