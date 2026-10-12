package Praktikum04.RumahSakit;
// untuk membungkus data/atribut dan method dalam sebuah class 
// serta melindungi data dalam class agar tidak bisa diakses langsung dari luar.
import java.time.LocalDate;

// kenapa tipe data pegawai? krn pegawai sebuah clas,
// sehingga object dari class Pegawai dapat digunakan sebagai tipe data untuk menyimpan dokter dan perawat.
// hubungan antara class Konsultasi dengan class Pegawai adalah Konsultasi menggunakan object Pegawai 
// untuk menyimpan data dokter dan perawat yang menangani konsultasi tersebut. ini alh relasi kelasnya
public class Konsultasi {
    private LocalDate tanggal; // LocalDate digunakan untuk menyimpan tanggal terjadinya konsultasi.
    private Pegawai dokter; // Karena dokter merupakan objek dari class Pegawai
    private Pegawai perawat;

    // implementasikan getter dan setter
    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai dokter) {
        this.dokter = dokter;
    }

    public Pegawai getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai perawat) {
        this.perawat = perawat;
    }

    // implementasikan method
    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Dokter: " + dokter.getInfo();
        info += ", Perawat: " + perawat.getInfo();
        info += "\n";
        return info;
}
}

