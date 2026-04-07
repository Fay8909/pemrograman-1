package Latihan;

import javax.swing.JOptionPane;

public class latihan_2 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Ketik Nama Anda: ");
        String Inputusia = JOptionPane.showInputDialog("Masukan Usia Anda: ");
        int usia = Integer.parseInt(Inputusia);

        String msg = "Hello " + nama + " Usia anda " + usia + " Tahun.";
        JOptionPane.showMessageDialog(null, msg);

    }
}
