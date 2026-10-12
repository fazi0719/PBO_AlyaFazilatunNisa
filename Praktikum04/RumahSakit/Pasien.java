package Praktikum04.RumahSakit;
import java.util.ArrayList;
import java.time.LocalDate;

// class yg berhubungan dengan pasien adl konsultasi ini merupakan contoh relasi clas
public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi; //Membuat variabel riwayatKonsultasi

    // implementasikan getter dan setter
    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // constructor
public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis; // this = atribut milik objek sedangkan nomedis = parameter method
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi>();  // Membuat ArrayList baru untuk riwayatKonsultasi
    }

    // implementasikan method 
    public String getInfo() {
     String info = "";
     info += "No Rekam Medis: " + this.noRekamMedis + "\n";
     info += "Nama: " + this.nama + "\n";

     // Menampilkan riwayat konsultasi jika ada
     if (!riwayatKonsultasi.isEmpty()) {  // Cek apakah ada riwayat konsultasi
         info += "Riwayat Konsultasi:\n"; 

         for (Konsultasi konsultasi : riwayatKonsultasi) { 
             info += konsultasi.getInfo(); // Karena informasi tanggal, dokter, dan perawat disimpan dalam object Konsultasi
         }
        }
        else {
            info += "Belum ada riwayat konsultasi\n";
            }
            info += "\n";

             return info;
        }

    // implementasikan method 
    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasi = new Konsultasi(); // kenapa bisa gini? Karena setiap kali menambahkan konsultasi, 
        // kita perlu membuat object Konsultasi baru, mengisi datanya, kemudian memasukkannya ke riwayatKonsultasi
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }
}


// hpuskonusltasi
 //  public void hapusKonsultasiTerakhir() {
 //   if (!riwayatKonsultasi.isEmpty()) {
 //       riwayatKonsultasi.remove(riwayatKonsultasi.size() - 1);
 //       System.out.println("Konsultasi terakhir berhasil dihapus");
 //   } else {
 //       System.out.println("Belum ada riwayat konsultasi");
 //   }

 // mencari pasien udh ada riwayat 
 // public boolean punyaRiwayatKonsultasi() {
 //   return !riwayatKonsultasi.isEmpty();
// }