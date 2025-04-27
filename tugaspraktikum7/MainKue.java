// Kelas MainKue berfungsi sebagai kelas utama untuk menjalankan program
public class MainKue {
    public static void main(String[] args) {
        // Membuat array kue berisi 20 elemen
        Kue[] kue = new Kue[20];

        // Mengisi elemen array kue dengan objek KuePesanan
        kue[0] = new KuePesanan("Brownies", 50000, 2);
        kue[1] = new KuePesanan("Cheesecake", 60000, 1.5);
        kue[2] = new KuePesanan("Tiramisu", 70000, 1.2);
        kue[3] = new KuePesanan("Opera Cake", 80000, 0.8);
        kue[4] = new KuePesanan("Blackforest", 55000, 1.8);

        // Mengisi elemen array kue dengan objek KueJadi
        kue[5] = new KueJadi("Donat", 5000, 10);
        kue[6] = new KueJadi("Kue Lapis", 8000, 8);
        kue[7] = new KueJadi("Pastel", 6000, 12);
        kue[8] = new KueJadi("Klepon", 3000, 15);
        kue[9] = new KueJadi("Nagasari", 4000, 9);

        // Mengisi sisa array kue secara otomatis dengan kombinasi KuePesanan dan KueJadi
        for (int i = 10; i < 20; i++) {
            if (i % 2 == 0) {
                // Jika indeks genap, buat objek KuePesanan
                kue[i] = new KuePesanan("KuePesanan" + i, 40000 + i * 1000, 1 + i * 0.1);
            } else {
                // Jika indeks ganjil, buat objek KueJadi
                kue[i] = new KueJadi("KueJadi" + i, 3000 + i * 500, 5 + i);
            }
        }

        // Menampilkan daftar semua kue
        System.out.println("Daftar Kue:");
        for (Kue k : kue) {
            System.out.println(k);
        }

        // Variabel untuk menyimpan total harga dan total berat/jumlah
        double totalHarga = 0;
        double totalBeratKuePesanan = 0;
        double totalJumlahKueJadi = 0;
        double totalHargaKuePesanan = 0;
        double totalHargaKueJadi = 0;

        // Variabel untuk menyimpan kue dengan harga tertinggi
        Kue kueTermahal = kue[0];

        // Menghitung total harga, berat/jumlah, dan mencari kue termahal
        for (Kue k : kue) {
            totalHarga += k.hitungHarga(); // Menambahkan harga masing-masing kue ke total

            if (k instanceof KuePesanan) {
                // Jika kue adalah KuePesanan, hitung harga dan berat
                totalHargaKuePesanan += k.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) k).getBerat();
            } else if (k instanceof KueJadi) {
                // Jika kue adalah KueJadi, hitung harga dan jumlah
                totalHargaKueJadi += k.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) k).getJumlah();
            }

            // Membandingkan harga kue saat ini dengan kueTermahal
            if (k.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = k; // Update kueTermahal jika ditemukan harga yang lebih tinggi
            }
        }

        // Menampilkan hasil perhitungan
        System.out.println("\nTotal harga semua kue: Rp" + totalHarga);
        System.out.println("Total harga KuePesanan: Rp" + totalHargaKuePesanan);
        System.out.println("Total berat KuePesanan: " + totalBeratKuePesanan + " kg");
        System.out.println("Total harga KueJadi: Rp" + totalHargaKueJadi);
        System.out.println("Total jumlah KueJadi: " + totalJumlahKueJadi + " buah");

        // Menampilkan kue dengan harga tertinggi
        System.out.println("\nKue dengan harga tertinggi:");
        System.out.println(kueTermahal);
    }
}
