package Praktikum04.RumahSakit;
import java.time.LocalDate;
public class RumahSakitDemo {
    
    public static void main(String[] args){
        Pegawai ani = new Pegawai("1234", "dr. Ani");
        Pegawai bagus = new Pegawai("4567", "dr. Bagus");

        Pegawai desi = new Pegawai("1234", "Ns. Desi");
        Pegawai eka = new Pegawai("4567", "Ns. Eka");

        Pasien pasien1 = new Pasien("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien pasien2 = new Pasien("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
// PASIEN1.SETNAMA("SINTA");
//pasien1.hapusKonsultasiTerakhir();
//System.out.println("Setelah dihapus:");
//System.out.println(pasien1.getInfo());

// mencari
// if (pasien1.punyaRiwayatKonsultasi()) {
//    System.out.println("Pasien memiliki riwayat konsultasi");
// } else {
//    System.out.println("Pasien belum memiliki riwayat konsultasi");
// }

// mengubha dokter 1 ke 2
// pasien1.getRiwayatKonsultasi().get(0).setDokter(bagus);
// System.out.println(pasien1.getInfo());