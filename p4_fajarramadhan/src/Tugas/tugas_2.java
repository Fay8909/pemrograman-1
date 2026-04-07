package Tugas;

import java.util.Scanner;

// KONVERSI SUHU DARI CELCIUS KE FAHRENHEIT & KELVIN
public class tugas_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();
        System.out.println("================================");

        //rumus untuk konversi dari celcius ke fahrenheit & kelvin
        double fahrenheit = (9.0 / 5.0 * celsius) + 32;
        double kelvin = celsius + 273;

        System.out.println("\n=== Hasil Konversi ===");
        System.out.println("Celsius: " + celsius + " C");
        System.out.println("Fahrenheit: " + fahrenheit + " F");
        System.out.println("Kelvin: " + kelvin + " K");

        input.close();
    }
}