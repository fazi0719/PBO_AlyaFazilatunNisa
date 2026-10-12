package Praktikum03;

public class User {
    // atribut user
    // menggunakan public
    public String username;
    public String email;
    public String password;
    public String name;

    // Constructor digunakan untuk memberikan nilai awal ketika objek User dibuat.
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.password = "polinema123";
    }
    // method untuk menampilkan informasi user
    public void displayInfo() { 
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Name: " + name); 
    }
}

// nilai password sudah ditentukan langsung di dalam constructor dengan 
// this.password = \"polinema123\". Sedangkan username dan email mengambil nilai dari parameter saat objek dibuat.