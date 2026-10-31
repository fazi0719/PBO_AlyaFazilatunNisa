package Praktikum07.tugas;

public class Mobil extends Kendaraan {
    
    public Mobil() {
    }

    
    public Mobil(String merk, String warna, double harga) {
        super(merk, warna, harga);
    }

    @Override 
    public String getInfo() {
        String info = super.getInfo();
        info += "Jenis  : Mobil (Kendaraan Darat)\n";
        return info;
    }

    public void jalanDiJalanRaya() {
        System.out.println("Mobil sedang berjalan di jalan raya.");
    }
}