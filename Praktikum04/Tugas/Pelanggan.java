package Praktikum04.Tugas;

import java.util.ArrayList;
public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Pesanan> riwayatPesanan; // satu pelanggan bisa memiliki banyak pesanan, maka data pesanan disimpan dalam ArrayList<Pesanan>.
    // merupakan relasi
    // mendeklarasikan tempat untuk menyimpan banyak Pesanan.

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.riwayatPesanan = new ArrayList<>(); // utk membuta aarylist
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPesanan(Pesanan pesanan) {
        riwayatPesanan.add(pesanan);
    }

    public ArrayList<Pesanan> getRiwayatPesanan() {
        return riwayatPesanan;
    }

    public String getInfo() {
        String info = "";

        info += "ID Pelanggan: " + idPelanggan + "\n";
        info += "Nama Pelanggan: " + nama + "\n";

        if (!riwayatPesanan.isEmpty()) { // digunakan untuk menyimpan objek dari class Kue di dalam sebuah Pesanan.
            info += "Riwayat Pesanan:\n";

            for (Pesanan pesanan : riwayatPesanan) { // mengulang setiap data Pesanan yang ada di riwayatPesanan
                info += pesanan.getInfo();
                info += "\n";
            }
        } else {
            info += "Belum ada riwayat pesanan\n";
        }

        return info;
    }
}
