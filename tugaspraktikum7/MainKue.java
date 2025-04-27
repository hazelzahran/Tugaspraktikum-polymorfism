public class MainKue {
    public static void main(String[] args) {
        Kue[] kue = new Kue[20];

        // Isi array kue
        kue[0] = new KuePesanan("Brownies", 50000, 2);
        kue[1] = new KuePesanan("Cheesecake", 60000, 1.5);
        kue[2] = new KuePesanan("Tiramisu", 70000, 1.2);
        kue[3] = new KuePesanan("Opera Cake", 80000, 0.8);
        kue[4] = new KuePesanan("Blackforest", 55000, 1.8);

        kue[5] = new KueJadi("Donat", 5000, 10);
        kue[6] = new KueJadi("Kue Lapis", 8000, 8);
        kue[7] = new KueJadi("Pastel", 6000, 12);
        kue[8] = new KueJadi("Klepon", 3000, 15);
        kue[9] = new KueJadi("Nagasari", 4000, 9);

        // Sisa array kue lainnya (acak aja biar penuh)
        for (int i = 10; i < 20; i++) {
            if (i % 2 == 0) {
                kue[i] = new KuePesanan("KuePesanan" + i, 40000 + i * 1000, 1 + i * 0.1);
            } else {
                kue[i] = new KueJadi("KueJadi" + i, 3000 + i * 500, 5 + i);
            }
        }

        // Tampilkan semua kue
        System.out.println("Daftar Kue:");
        for (Kue k : kue) {
            System.out.println(k);
        }

        // Hitung total harga dan total berat/jumlah
        double totalHarga = 0;
        double totalBeratKuePesanan = 0;
        double totalJumlahKueJadi = 0;
        double totalHargaKuePesanan = 0;
        double totalHargaKueJadi = 0;

        Kue kueTermahal = kue[0];

        for (Kue k : kue) {
            totalHarga += k.hitungHarga();

            if (k instanceof KuePesanan) {
                totalHargaKuePesanan += k.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) k).getBerat();
            } else if (k instanceof KueJadi) {
                totalHargaKueJadi += k.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) k).getJumlah();
            }

            if (k.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        System.out.println("\nTotal harga semua kue: Rp" + totalHarga);
        System.out.println("Total harga KuePesanan: Rp" + totalHargaKuePesanan);
        System.out.println("Total berat KuePesanan: " + totalBeratKuePesanan + " kg");
        System.out.println("Total harga KueJadi: Rp" + totalHargaKueJadi);
        System.out.println("Total jumlah KueJadi: " + totalJumlahKueJadi + " buah");

        System.out.println("\nKue dengan harga tertinggi:");
        System.out.println(kueTermahal);
    }
}
