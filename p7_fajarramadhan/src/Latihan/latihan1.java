package Latihan;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = "", jurusan = "", pilihan = "",  shift ="";
        
        System.out.println("Masukan Pilihan: ");
        int pil = input.nextInt();
        input.nextLine();

        if(pil == 1){
            System.out.println("Masukan Nama: ");
            nama = input.nextLine();
            jurusan = "Teknik Informatika";

            System.out.println("Masukan Reguler (A/B/CK/CS): ");
            pilihan = input.nextLine();

            switch (pilihan) {
                case "a":
                    shift = "Reguler A";
                    break;
                case "b":
                     shift = "Reguler B";
                    break;
                case "ck":
                     shift = "Reguler CK";
                    break;
                case "cs":
                     shift = "Reguler CS";
                    break;
                default:
                    shift = "Reguler A";
                    break;
            }

        } else {
            System.out.println("Keluar");
        }
        
        System.out.println("===============================");
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Anda merupakan " + shift);
        System.out.println("===============================");
        
        input.close();
    }
}

// buat program pengulangan tema: bebas