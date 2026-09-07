package Praktikum03;

public class Motor {
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;
 
    // method untuk menampilkan informasi motor
    public void displayInfo() { 
        System.out.println("Plat Nomor: " + this.platNomor);
        System.out.println("Status Mesin: " + (this.statusMesin ? "On" : "Off"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("============================");
    }
}
