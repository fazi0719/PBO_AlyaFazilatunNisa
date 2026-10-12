package Praktikum04.Tugas;

public class TokoKueDemo {
    public static void main(String[] args) {
        Kue kue1 = new Kue("K001", "Brownies Cokelat", 50000);
        Kue kue2 = new Kue("K002", "Cheesecake", 75000);
        Kue kue3 = new Kue("K003", "Donat", 10000);

        // kuis 
        kue1.setNamaKue("Brownies Keju");
        kue1.getNamaKue();
        System.out.println( kue1.getNamaKue());

        Pelanggan pelanggan1 = new Pelanggan("P001", "Alya");

        Pesanan pesanan1 = new Pesanan(kue1, 2);
        Pesanan pesanan2 = new Pesanan(kue2, 1);
        Pesanan pesanan3 = new Pesanan(kue3, 6);

        //kenapa pesanan1, pesanan2, dan pesanan3 dimasukkan ke pelanggan1
        // Karena pesanan1, pesanan2, dan pesanan3 merupakan object Pesanan yang 
        // menyimpan data pesanan pelanggan, sehingga dimasukkan ke riwayatPesanan milik pelanggan1
        pelanggan1.tambahPesanan(pesanan1); 
        pelanggan1.tambahPesanan(pesanan2);
        pelanggan1.tambahPesanan(pesanan3);

        System.out.println(pelanggan1.getInfo());
    }
}


// modifikasi julah
// pesnan1.setjumlah(5);

// modifikasi ubah kue yang dipesan oleh pesanan1 menjadi kue2
// pesanan1.setKue(kue2);

