package Praktikum08.Tugas;

public class KendaraanDemo {
    public static void main(String[] args) {

        Mobil mobil1 = new Mobil(4, "Mercedes-Benz G-Class", "Hitam", 5800000000.0);

        System.out.println("=== INFORMASI MOBIL ===");
        mobil1.cetakInfo();
        mobil1.nyalakan();
        mobil1.jalanDiJalanRaya();

        System.out.println();

        Pesawat pesawat1 = new Pesawat(2, "Airbus A330-900neo", "Putih", 1200000000000.0);

        System.out.println("=== INFORMASI PESAWAT ===");
        pesawat1.cetakInfo();
        pesawat1.nyalakan();
        pesawat1.lepasLandas();
    }
}
