/**
 * Class pengujian utama (driver class) untuk memverifikasi fungsionalitas sistem keanggotaan gym FitTrack.
 * <p>
 * Class ini bertanggung jawab untuk mengeksekusi empat skenario pengujian utama:
 * <ol>
 *   <li>Instansiasi minimal 4 objek {@link Member} ke dalam array dengan kombinasi paket berbeda
 *       (Basic, Premium, VIP) serta pengujian constructor tanpa paket.</li>
 *   <li>Pengujian penanganan validasi saat instansiasi menggunakan data yang melanggar aturan format
 *       (misalnya nomor telepon tidak valid) dan pembuktian penggunaan nilai default aman.</li>
 *   <li>Pengujian mekanisme setter pada objek yang telah terbuat untuk membuktikan bahwa data lama
 *       tetap dipertahankan saat menerima input tidak valid.</li>
 *   <li>Menampilkan representasi seluruh data member dari array menggunakan perulangan {@code for}
 *       dan method {@code toString()} yang telah di-override.</li>
 * </ol>
 *
 * @author Reza
 * @version 1.0
 */
public class TesFitTrack {
    /**
     * Kapasitas elemen array untuk menyimpan data member gym FitTrack.
     * Ditetapkan minimal 4 objek sesuai dengan spesifikasi tugas untuk menghindari magic number.
     */
    private static final int JUMLAH_MEMBER = 4;

    /**
     * Constructor privat untuk mencegah pembuatan instansiasi objek dari driver class ini.
     */
    private TesFitTrack() {
        // Menghindari instansiasi kelas pengujian
    }

    /**
     * Titik masuk utama (entry point) eksekusi program pengujian FitTrack.
     * Method ini menjalankan seluruh alur pembuatan objek, pengujian batas validasi,
     * dan pencetakan data ke konsol secara berurutan.
     *
     * @param args argumen baris perintah (command line arguments) yang diteruskan saat aplikasi dijalankan
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
