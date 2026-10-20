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
    }
}
