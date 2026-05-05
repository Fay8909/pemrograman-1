package Latihan;
import java.util.Scanner;

public class InputMahasiswaSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do{
            System.out.print("\nNama: ");
            String nama = input.nextLine();

            System.out.print("NIM: ");
            String nim = input.nextLine();

            System.out.println("\nData: " + nama +" - " + nim);

            System.out.print("Ulangi? (y/n): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        }while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program Selesai");
        input.close();
    }
}
