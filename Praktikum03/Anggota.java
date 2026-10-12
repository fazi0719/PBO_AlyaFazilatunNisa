package Praktikum03;

// Enkapsulasi adalah penyatuan atribut dan method dari suatu objek menjadi satu kesatuan,
// sekaligus membatasi akses langsung terhadap komponen objek.
public class Anggota {
    private String nomorKTP; // enkapsulasi adalah dengan membuat atribut private, sehingga tidak bisa diakses langsung dari luar kelas
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    // enkapsulasi bertujuan membatasi akses langsung terhadap komponen objek

    // constructor digunakan utk membuat objek (contohnya di class testkoperasi)
    public Anggota(String nomorKTP, String nama, int limitPinjaman) { // parameter
        // memasukkan data ke atribut objek
        this.nomorKTP = nomorKTP; // this.nomorktp atribut milik objek , nomorktp: parameter method
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    // Untuk mengaksesnya dari luar kelas, kita buat getter untuk setiap atribut
    // getter itu untuk menampilkan nilai dari atribut
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
    // getJumlahPinjaman tidak mempuai setter karena jumlah pinjaman tidak bisa diubah langsung dari luar kelas,
    // hanya bisa diubah melalui method pinjam dan angsur
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method pinjam dengan validasi limit
    public void pinjam(int nominal) {
        if (this.jumlahPinjaman + nominal > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else { 
            this.jumlahPinjaman += nominal; // bagian yg menambahkan nilai
        }
    }

    // Method angsur untuk mengurangi jumlah pinjaman
    // modifikasi tugas 2: angsuran harus 10% dari jumlah pinjaman
    public void angsur(int nominal) {
        if (nominal < (0.1 * this.jumlahPinjaman)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
        this.jumlahPinjaman -= nominal;
    }
}
}
// mana read only nya? Atribut nomorKTP, nama, limitPinjaman, dan jumlahPinjaman 
// bersifat read-only dari luar class karena hanya memiliki getter dan tidak memiliki setter.
// this.platNomor → atribut milik object
// platNomor → parameter method