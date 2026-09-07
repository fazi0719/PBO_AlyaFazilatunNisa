package Praktikum03;

public class MotorDemo {
    public static void main(String[] args) {
        // Membuat objek motor1
        Motor motor1 = new Motor();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayInfo();

        // Membuat objek motor2
        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setStatusMesin(true);
        motor2.setKecepatan(40);
        motor2.displayInfo();

        // Membuat objek motor3
        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayInfo();

        // Pengujian Modifikasi No. 4: Kecepatan maksimal 100
        Motor motor4 = new Motor();
        motor4.setPlatNomor("N 1234 XY");
        motor4.setStatusMesin(true);
        motor4.setKecepatan(120); // Diisi nilai melebihi 100
        motor4.displayInfo();
    }
}




