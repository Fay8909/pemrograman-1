package Tugas;

import java.util.Scanner;

public class InputNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("\nMasukan nilai mahasiswa: ");
            int nilai = input.nextInt();

            System.out.println("Nilai Mahasiswa: " + nilai);

            System.out.print("\nInput Nilai lagi? \n(y/t): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program Selesai");
        input.close();
    }
}
