package Praktikum10.percobaan_praktikum;

public class Main {
      public static void main(String[] args) {

        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Samsung";
        kulkas.warna = "Silver";
        kulkas.harga = 3000000;
        kulkas.jumlahPintu = 2;

        TV tv = new TV();
        tv.merk = "LG";
        tv.warna = "Hitam";
        tv.harga = 2500000;
        tv.jenisLayar = "LED";
        tv.volume = 10;

        System.out.println("=== INFORMASI KULKAS ===");
        System.out.println(kulkas.getInfo());

        System.out.println("\n=== INFORMASI TV ===");
        System.out.println(tv.getInfo());

        System.out.println("\n=== UJI INTERFACE AUDIBLE ===");

        tv.naikkanVolume();
        System.out.println("Volume TV setelah dinaikkan: " + tv.volume);

        tv.turunkanVolume();
        System.out.println("Volume TV setelah diturunkan: " + tv.volume);
    }
}
