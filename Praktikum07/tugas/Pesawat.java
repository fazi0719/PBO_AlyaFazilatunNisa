package Praktikum07.tugas;

public class Pesawat extends Kendaraan {
    // Constructor 1: Tanpa Parameter
    public Pesawat() {
    }

    // Constructor 2: Berparameter (Memanggil Super Constructor)
    public Pesawat(String merk, String warna, double harga) {
        super(merk, warna, harga);
    }

    // Method Overriding getInfo() sesuai arahan dosen
    public String getInfo() {
        String info = super.getInfo();
        info += "Jenis  : Pesawat (Kendaraan Udara)\n";
        return info;
    }

    public void lepasLandas() {
        System.out.println("Pesawat sedang lepas landas.");
    }
}
