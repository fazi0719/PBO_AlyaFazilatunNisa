package Praktikum02;

public class Dragon {
    // ATRIBUT
    int x; // x merupakan posisi horizontal naga / mendatar
    int y; // y merupakan posisi vertikal naga / tegak
    int direction; // arah naga (1 = Atas, 2 = Kanan, 3 = Bawah, 4 = Kiri)

    // CONSTRUCTOR
    Dragon() {  // 
        x = 0; // nilai 0 masuk ke x
        y = 0;
        direction = 1; // 1 = Atas
        // kalau x dan y di hpius ttp bisa dijalankan karena 
    } 

   // method untuk mengubah arah naga / method changeDirection
   // parameter newDirection hanya boleh 1 sampai 4
    public void changeDirection(int newDirection) {

        // Direction hanya boleh 1 sampai 4
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection; // direction atribut dan yang diubah direction parameter
        } else {
            System.out.println("Arah tidak valid! Gunakan 1-4.");
        }
    }

    // method untuk menggerakkan naga / method move
    // parameter 
    public void move(int steps) {

        switch (direction) {

            case 1: // Atas
                y += steps;
                break;

            case 2: // Kanan
                x += steps;
                break;

            case 3: // Bawah
                y -= steps;
                break;

            case 4: // Kiri
                x -= steps;
                break;
        }
    }

   // method untuk menampilkan status naga / method printStatus
    public void printStatus() {

        System.out.println("Posisi X : " + x);
        System.out.println("Posisi Y : " + y);

        if (direction == 1) {
            System.out.println("Arah     : Atas");
        } else if (direction == 2) {
            System.out.println("Arah     : Kanan");
        } else if (direction == 3) {
            System.out.println("Arah     : Bawah");
        } else if (direction == 4) {
            System.out.println("Arah     : Kiri");
        }

        System.out.println("-----------------------");
    }
}
