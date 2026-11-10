package Praktikum11.Percobaan_Praktikum;

public class Demo {
    public static void main(String[] args) {
  // Uji coba pembuktian Pertanyaan 2.6 Nomor 5
        Pegawai p = new Pegawai("123", "Budi");
        Dosen d = (Dosen) p; // Baris ini akan menyebabkan runtime error ClassCastException
    }
}
