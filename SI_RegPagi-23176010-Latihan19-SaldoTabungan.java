
package latihan_pertemuan_6;
/**
 * NAMA              : Lutfia Wulandari
 * KELAS             : PBO12
 * NIM               : 23176008
 * PRODI             : Sistem Informasi
 * SEMESTER          : 3
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program           : Saldo tabungan
 */
public class Latihan_19 {

    public static void main(String[] args) {
        // Deklarasi variabel input
        double saldoAwal = 2500000;     // Saldo awal sebesar Rp 2.500.000
        double bungaPerBulan = 15;      // Bunga per bulan dalam persen
        int lamaBulan = 6;              // Lama tabungan dalam bulan

        // Tampilkan saldo awal
        System.out.printf("Saldo Awal: Rp %.2f%n", saldoAwal);
        System.out.printf("Bunga/Bulan: %.2f%%%n", bungaPerBulan);
        System.out.println("Lama (bulan): " + lamaBulan);

        // Loop untuk menghitung saldo setiap bulan
        for (int i = 1; i <= lamaBulan; i++) {
            double bunga = saldoAwal * (bungaPerBulan / 100);  // Menghitung bunga bulan ini
            saldoAwal += bunga;  // Menambah bunga ke saldo

            // Tampilkan saldo setelah bunga tiap bulan
            System.out.printf("Saldo setelah bulan ke-%d: Rp %.2f%n", i, saldoAwal);
        }

        // Tampilkan saldo akhir setelah periode selesai
        System.out.printf("Saldo Akhir setelah %d bulan: Rp %.2f%n", lamaBulan, saldoAwal);
    }
}
