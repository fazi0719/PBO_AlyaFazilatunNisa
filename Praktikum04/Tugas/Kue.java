package Praktikum04.Tugas;

public class Kue {
    private String kodeKue;
    private String namaKue;
    private double harga;

    public Kue(String kodeKue, String namaKue, double harga) {
        this.kodeKue = kodeKue;
        this.namaKue = namaKue;
        this.harga = harga;
    }

    public String getKodeKue() {
        return kodeKue;
    }

    public void setKodeKue(String kodeKue) {
        this.kodeKue = kodeKue;
    }

    public String getNamaKue() {
        return namaKue;
    }

    public void setNamaKue(String namaKue) {
        this.namaKue = namaKue;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getInfo() {
        String info = "";
        info += "Kode Kue: " + kodeKue + "\n";
        info += "Nama Kue: " + namaKue + "\n";
        info += "Harga: Rp" + harga + "\n";
        return info;
    }
}
