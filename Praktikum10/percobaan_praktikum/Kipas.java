package Praktikum10.percobaan_praktikum;

public class Kipas extends AlatElektronik {
    public String jenis;

    @Override
    public String getInfo() {
        return super.getInfo() +
               "\nJenis: " + jenis;
    }
}
