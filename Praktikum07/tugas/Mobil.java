package Praktikum07.tugas;

public class Mobil extends Kendaraan {
    // Constructor 1: Tanpa Parameter
    public Mobil() {
    }

    // Constructor 2: Berparameter (Memanggil Super Constructor)
    public Mobil(String merk, String warna, double harga) {
        super(merk, warna, harga);
    }

    // Method Overriding getInfo() sesuai arahan dosen
    public String getInfo() {
        String info = super.getInfo();
        info += "Jenis  : Mobil (Kendaraan Darat)\n";
        return info;
    }

    public void jalanDiJalanRaya() {
        System.out.println("Mobil sedang berjalan di jalan raya.");
    }
}