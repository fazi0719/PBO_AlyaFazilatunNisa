package Praktikum04.RumahSakit;
// Enkapsulasi adalah penyatuan atribut dan method dari suatu objek menjadi satu kesatuan,
// sekaligus membatasi akses langsung terhadap komponen objek.
// private membatasi akses langsung terhadapa atribut dari luar class
// Untuk mengaksesnya digunakan method seperti getter dan setter.
public class Pegawai {
    private String nip;
    private String nama;

    // constructor
public Pegawai(String nip, String nama) {
    this.nip = nip;
    this.nama = nama;
}
    // implementasikan getter dan setter
public String getNip() {
    return nip;    
}

public void setNip(String nip) {
    this.nip = nip;
}
public String getNama() {
    return nama;
}
public void setNama(String nama) {
    this.nama = nama;
}

// implementasikan method 
public String getInfo() {
    return nama + " (" + nip + ")";
}
}