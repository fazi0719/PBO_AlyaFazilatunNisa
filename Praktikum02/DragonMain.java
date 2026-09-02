package Praktikum02;

public class DragonMain {

    public static void main(String[] args) {

        // BAGIAN 1:  OBJEK DRAGON 1
        System.out.println("==========================================");
        System.out.println("              BAGIAN DRAGON 1             ");
       
        // 1. Pembuatan objek dragon1
        Dragon dragon1 = new Dragon();  // Dragon in tipe data istimewa karena kumpulan dri banyk nilai
        // nama parameter 

        // 2. Status awal dragon1
        System.out.println("-> Status Awal Dragon 1:");
        dragon1.printStatus(); 
        System.out.println();

        // 3. Pergerakan langkah 1: Maju ke atas (arah bawaan = 1)
        dragon1.move(5);
        System.out.println("-> Setelah maju 5 langkah ke atas:");
        dragon1.printStatus();
        System.out.println();

        // 4. Pergerakan langkah 2: Ubah arah ke kanan (2) lalu maju 3 langkah
        dragon1.changeDirection(2);
        dragon1.move(3);
        System.out.println("-> Setelah ubah arah ke kanan dan maju 3 langkah:");
        dragon1.printStatus();
        System.out.println("\n");



        
        // BAGIAN 2: KHUSUS OBJEK DRAGON 2
        // ==========================================================
        System.out.println("==========================================");
        System.out.println("              BAGIAN DRAGON 2             ");
        System.out.println("==========================================");

        // 1. Pembuatan objek dragon2
        Dragon dragon2 = new Dragon();

        // 2. Status awal dragon2
        System.out.println("-> Status Awal Dragon 2:");
        dragon2.printStatus();
        System.out.println();

        // 3. Pergerakan langkah 1: Ubah arah ke kanan (2) lalu maju 4 langkah
        dragon2.changeDirection(2);
        dragon2.move(4);
        System.out.println("-> Setelah ubah arah ke kanan dan maju 4 langkah:");
        dragon2.printStatus();
        System.out.println();

        // 4. Pergerakan langkah 2: Ubah arah ke bawah (3) lalu maju 2 langkah
        dragon2.changeDirection(3);
        dragon2.move(2);
        System.out.println("-> Setelah ubah arah ke bawah dan maju 2 langkah:");
        dragon2.printStatus();
        System.out.println("==========================================");
    }
}