package Praktikum07;

public class Dosen  extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Ini constructor class Dosen");
    }

    // Constructor 2: Berparameter (Overloading)
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(); // memanggil constructor class Pegawai
        super.nip = nip;
        super.nama = nama;
        super.gaji = gaji;
        this.nidn = nidn;
    }

    public String getInfo() {
       return "NIDN  : " + this.nidn + "\n"; 
    }
    public String getAllInfo() {
        String info = super.getInfo(); // memanggil method getInfo() dari class Pegawai
        info += this.getInfo(); // memanggil method getInfo() dari class Dosen
        return info;
    }
}
