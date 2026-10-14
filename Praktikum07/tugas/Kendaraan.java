package Praktikum07.tugas;

public class Kendaraan {
    public String merk;
    public String warna;
    public double harga;

    // Constructor 1: Tanpa Parameter (Overloading)
    public Kendaraan() {
    }

    // Constructor 2: Berparameter (Overloading)
    public Kendaraan(String merk, String warna, double harga) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    // Method getInfo() di Superclass
    public String getInfo() {
        String info = "";
        info += "Merk   : " + merk + "\n";
        info += "Warna  : " + warna + "\n";
        info += "Harga  : Rp" + harga + "\n";
        return info;
    }

    public void nyalakan() {
        System.out.println("Kendaraan dinyalakan.");
    }
}
