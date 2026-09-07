package Praktikum03;

public class Motor {
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;
  
    // menambahkan  getter dan setter untuk atribut platNomor, statusMesin, dan kecepatan
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean getStatusMesin() {
        return statusMesin;
    }

    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }

 // modifikasi nomor 4: kecepatan maksimalnya adalah 100
    public void setKecepatan(int kecepatan) {
        if (!this.statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan maksimal adalah 100");
            this.kecepatan = 100;
        } else {
            this.kecepatan = kecepatan;
        }
    }
    // method untuk menampilkan informasi motor
    public void displayInfo() { 
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Status Mesin: " + (this.statusMesin ? "On" : "Off"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("============================");
    }
}
