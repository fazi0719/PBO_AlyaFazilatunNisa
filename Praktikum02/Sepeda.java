package Praktikum02;

public class Sepeda {
    float kecepatan; // Atribut 
    int gear;

    public Sepeda() { 
    }
    public Sepeda(float newKecepatan, int newGear) {
        kecepatan = newKecepatan;
        gear = newGear;
    }
    // Method untuk menambah kecepatan 
    // nomor 9
    public void tambahKecepatan(float increment) {
    kecepatan += increment;
    if (kecepatan > 20) {
        kecepatan = 20;
    }
}

    // Method untuk mengurangi kecepatan
    // nomor 8
    public void kurangiKecepatan(float decrement) {
    kecepatan -= decrement;
    if (kecepatan < 0) {
        kecepatan = 0;
    }
}

    // Method untuk menampilkan informasi sepeda
    public void cetakInfo() {
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("==========================================");
    }
}
