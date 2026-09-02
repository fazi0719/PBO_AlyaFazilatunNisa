package Praktikum02;

public class Sepeda {
    float kecepatan; // Atribut 
    int gear;

    // Method untuk menambah kecepatan
    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    // Method untuk mengurangi kecepatan
    public void kurangiKecepatan(int decrement) {
        kecepatan = kecepatan - decrement;
    }

    // Method untuk menampilkan informasi sepeda
    public void cetakInfo() {
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        source: System.out.println("==========================================");
    }
}

