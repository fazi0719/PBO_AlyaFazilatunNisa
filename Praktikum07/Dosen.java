package Praktikum07;

public class Dosen  extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Ini constructor class Dosen");
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
