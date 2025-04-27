// Kelas KueJadi adalah turunan dari kelas Kue
public class KueJadi extends Kue {
    // Atribut tambahan untuk menyimpan jumlah kue
    private double jumlah;

    // Konstruktor untuk menginisialisasi nama, harga, dan jumlah kue
    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga); // Memanggil konstruktor superclass (Kue) untuk nama dan harga
        this.jumlah = jumlah; // Menginisialisasi atribut jumlah
    }

    // Method getter untuk mendapatkan nilai jumlah kue
    public double getJumlah() {
        return jumlah;
    }

    // Override method hitungHarga dari superclass
    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2; // Harga total dihitung dengan harga satuan dikali jumlah, kemudian dikali 2
    }
}
