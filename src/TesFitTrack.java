/**
 * Class pengujian untuk memverifikasi fungsionalitas sistem keanggotaan gym FitTrack.
 * Class ini mengeksekusi skenario uji pembuatan objek Member, pengujian validasi data,
 * serta menampilkan daftar member menggunakan array dan perulangan.
 */
public class TesFitTrack {
    // Konstanta jumlah member untuk inisialisasi array (minimal 4 objek sesuai spesifikasi)
    private static final int JUMLAH_MEMBER = 4;

    /**
     * Method utama untuk menjalankan program pengujian FitTrack.
     *
     * @param args argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       SISTEM PENDATAAN MEMBER GYM FITTRACK       ");
        System.out.println("==================================================");

        // Deklarasi dan inisialisasi array bertipe Member
        Member[] daftarMember = new Member[JUMLAH_MEMBER];

        // Skenario 1 & 2: Pembuatan objek Member dan pengujian validasi input saat instansiasi
        System.out.println("\n--- 1. Pendaftaran Member ke Sistem ---");
        
        // Member 1: Paket Basic (constructor lengkap)
        daftarMember[0] = new Member("Budi Santoso", "081234567890", "15-08-2026", Member.PAKET_BASIC);
        System.out.println("Member 1 berhasil didaftarkan.");

        // Member 2: Paket Premium (constructor lengkap)
        daftarMember[1] = new Member("Siti Rahma", "085678901234", "16-08-2026", Member.PAKET_PREMIUM);
        System.out.println("Member 2 berhasil didaftarkan.");

        // Member 3: Paket VIP (constructor lengkap)
        daftarMember[2] = new Member("Ahmad Fauzi", "087812345678", "17-08-2026", Member.PAKET_VIP);
        System.out.println("Member 3 berhasil didaftarkan.");

        // Member 4: Constructor tanpa paket, sengaja nomor telepon salah format (< 10 digit)
        System.out.println("\nPendaftaran Member 4 (Skenario input nomor telepon salah saat pembuatan):");
        daftarMember[3] = new Member("Rian Pratama", "08123", "18-08-2026");
        System.out.println("Member 4 berhasil didaftarkan dengan nomor telepon default aman.");

        // Skenario 3: Memanggil setter dengan nilai tidak valid pada objek yang sudah jadi
        System.out.println("\n--- 2. Pengujian Validasi Setter (Nilai Lama Harus Bertahan) ---");
        System.out.println("Nomor telepon Member 1 saat ini: " + daftarMember[0].getNoTelepon());
        System.out.println("Mencoba mengubah nomor telepon Member 1 dengan format salah (tidak diawali 0)...");
        daftarMember[0].setNoTelepon("181234567890");
        System.out.println("Nomor telepon Member 1 setelah dicoba ubah: " + daftarMember[0].getNoTelepon());

        // Skenario 4: Mencetak seluruh objek Member dari array memakai perulangan for dan toString()
        System.out.println("\n--- 3. Daftar Seluruh Data Member FitTrack ---");
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println((i + 1) + ". " + daftarMember[i].toString());
        }
    }
}
