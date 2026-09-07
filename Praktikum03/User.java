package Praktikum03;

public class User {
    // atribut user
    public String username;
    public String email;
    public String password;
    public String name;

    // Constructor baru
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
