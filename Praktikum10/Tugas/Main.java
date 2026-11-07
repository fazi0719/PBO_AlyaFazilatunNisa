package Praktikum10.Tugas;

public class Main {
    public static void main(String[] args) {

        Bebek bebek = new Bebek();

        System.out.println("=== BEBEK ===");
        bebek.berenang();
        bebek.selam();
        bebek.bertelur();

        KapalSelam kapal = new KapalSelam();

        System.out.println("\n=== KAPAL SELAM ===");
        kapal.berenang();
        kapal.selam();
        kapal.isiBallast();
    }
}
