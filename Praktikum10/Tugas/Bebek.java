package Praktikum10.Tugas;

public class Bebek implements Swimmer {

    @Override
    public void berenang() {
        System.out.println("Bebek berenang di permukaan air");
    }

    @Override
    public void selam() {
        System.out.println("Bebek menyelam untuk mencari makanan");
    }

    public void bertelur() {
        System.out.println("Bebek menghasilkan telur");
    }
    
}
