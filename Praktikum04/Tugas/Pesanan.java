package Praktikum04.Tugas;

// kenapa tipe datanya Kue, bukan String? 
//  untuk menyimpan objek dari class Kue yg berada di dalm class pesanan (diambil dri class kue)
public class Pesanan {
    private Kue kue; 
    private int jumlah;

    public Pesanan(Kue kue, int jumlah) {
        this.kue = kue;
        this.jumlah = jumlah;
    }

    public Kue getKue() {
        return kue;
    }

    public void setKue(Kue kue) {
        this.kue = kue;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double hitungTotal() {
        return kue.getHarga() * jumlah; // Menghitung total harga berdasarkan harga satu kue × jumlah kue yang dipesan.
    }

    public String getInfo() {
        String info = "";
        info += "Kue: " + kue.getNamaKue() + "\n";
        info += "Jumlah: " + jumlah + "\n";
        info += "Total Harga: Rp" + hitungTotal() + "\n";
        return info;
    }
}
