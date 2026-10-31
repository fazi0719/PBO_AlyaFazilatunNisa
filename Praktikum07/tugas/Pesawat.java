package Praktikum07.tugas;

public class Pesawat extends Kendaraan {
    
    public Pesawat() {
    }

    
    public Pesawat(String merk, String warna, double harga) {
        super(merk, warna, harga);
        
    }

    
    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Jenis  : Pesawat (Kendaraan Udara)\n";
        return info;
    }

    public void lepasLandas() {
        System.out.println("Pesawat sedang lepas landas.");
    }
}
