// Kelas abstract Kue
public abstract class Kue {
    // Atribut nama bertipe String
    private String nama;
    
    // Atribut harga bertipe double
    private double harga;

    // Konstruktor untuk menginisialisasi nama dan harga
    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method getter untuk mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Method getter untuk mengambil nilai harga
    public double getHarga() {
        return harga;
    }

    // Method abstract hitungHarga yang harus diimplementasikan oleh subclass
    public abstract double hitungHarga();

    // Method toString untuk menampilkan nama kue dan hasil hitung harga
    public String toString() {
        return nama + " : Rp" + hitungHarga();
    }
}
