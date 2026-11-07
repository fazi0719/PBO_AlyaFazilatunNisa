package Praktikum10.Tugas;

public class KapalSelam implements Swimmer {

    @Override
    public void berenang() {
        System.out.println("Kapal selam bergerak di permukaan laut");
    }

    @Override
    public void selam() {
        System.out.println("Kapal selam menyelam ke dasar laut");
    }

    public void isiBallast() {
        System.out.println("Tangki ballast diisi untuk membantu kapal selam menyelam");
    }
}
