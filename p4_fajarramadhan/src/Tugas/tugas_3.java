package Tugas;
import java.util.Scanner;


//MENGHITUNG KONSUMSI BBM PER LITERNYA
public class tugas_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan jumlah BBM (liter): ");
        double bbm = input.nextDouble();

        double konsumsi = jarak / bbm;

        System.out.println("\n=== Hasil ===");
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("BBM: " + bbm + " liter");
        System.out.println("Konsumsi BBM: " + konsumsi + " km/liter");

        input.close();
    }
}
