package Praktikum07.tugas;

public class TugasDemo {
    public static void main(String[] args) {
        // Instansiasi 2 objek subclass menggunakan constructor berparameter
        Mobil mobil1 = new Mobil("Mercedes-Benz G-Class", "Hitam", 5800000000.0);
        Pesawat pesawat1 = new Pesawat("Airbus A330-900neo", "Putih", 1200000000000.0);

        System.out.println("=== INFORMASI MOBIL ===");
        System.out.println(mobil1.getInfo());
        mobil1.jalanDiJalanRaya();

        System.out.println();

        System.out.println("=== INFORMASI PESAWAT ===");
        System.out.println(pesawat1.getInfo());
        pesawat1.lepasLandas();
    }
}
