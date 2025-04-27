// Kelas KuePesanan adalah turunan dari kelas Kue
public class KuePesanan extends Kue {
    // Atribut tambahan untuk menyimpan berat kue
    private double berat;

    // Konstruktor untuk menginisialisasi nama, harga, dan berat kue
    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga); // Memanggil konstruktor superclass (Kue) untuk nama dan harga
        this.berat = berat; // Menginisialisasi atribut berat
    }

    // Method getter untuk mendapatkan nilai berat kue
    public double getBerat() {
        return berat;
    }

    // Override method hitungHarga dari superclass
    @Override
    public double hitungHarga() {
        return getHarga() * berat; // Harga total dihitung berdasarkan harga per satuan berat dikali berat
    }
}
