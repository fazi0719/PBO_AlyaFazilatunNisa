package Praktikum07.Percobaan_Praktikum;

public class Dosen  extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Ini constructor class Dosen");
    }

    // Constructor 2: Berparameter (Overloading)
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
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
