package Praktikum03;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // Constructor
    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    // Getter nomorKTP
    public String getNomorKTP() {
        return nomorKTP;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Getter limitPinjaman
    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    // Getter jumlahPinjaman (Read-Only)
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method pinjam dengan validasi limit
    public void pinjam(int nominal) {
        if (this.jumlahPinjaman + nominal > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    // Method angsur untuk mengurangi jumlah pinjaman
    public void angsur(int nominal) {
        this.jumlahPinjaman -= nominal;
    }
}
