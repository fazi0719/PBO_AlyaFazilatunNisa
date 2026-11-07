package Praktikum10.percobaan_praktikum;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    @Override
    public String getInfo() {
        return super.getInfo() +
               "\nJumlah Pintu: " + jumlahPintu;
    }
}
