/**
 * Merepresentasikan satu entitas member (anggota) yang terdaftar di gym FitTrack.
 * <p>
 * Class ini bertindak sebagai model data yang menerapkan prinsip enkapsulasi secara ketat.
 * Setiap perubahan data wajib melalui validasi di method setter masing-masing, serta
 * menjamin ketersediaan nilai default yang aman saat instansiasi.
 *
 * @author Reza
 * @version 1.0
 */
public class Member {
    /**
     * Konstanta jenis paket keanggotaan Basic.
     */
    public static final String PAKET_BASIC = "Basic";

    /**
     * Konstanta jenis paket keanggotaan Premium.
     */
    public static final String PAKET_PREMIUM = "Premium";

    /**
     * Konstanta jenis paket keanggotaan VIP.
     */
    public static final String PAKET_VIP = "VIP";

    /**
     * Karakter awalan wajib untuk nomor telepon member.
     */
    private static final String AWALAN_TELEPON = "0";

    /**
     * Batas panjang digit minimum untuk nomor telepon aktif member.
     */
    private static final int MIN_PANJANG_TELEPON = 10;

    /**
     * Nilai default aman untuk nama member jika input tidak valid.
     */
    private static final String DEFAULT_NAMA = "Member Baru";

    /**
     * Nilai default aman untuk nomor telepon jika input tidak valid.
     */
    private static final String DEFAULT_NO_TELEPON = "080000000000";

    /**
     * Nilai default aman untuk tanggal pendaftaran jika input tidak valid.
     */
    private static final String DEFAULT_TANGGAL_DAFTAR = "01-01-2026";

    /**
     * Nilai default aman untuk paket keanggotaan jika input tidak valid.
     */
    private static final String DEFAULT_JENIS_PAKET = PAKET_BASIC;

    // Atribut member dengan nilai awal default aman
    private String nama = DEFAULT_NAMA;
    private String noTelepon = DEFAULT_NO_TELEPON;
    private String tanggalDaftar = DEFAULT_TANGGAL_DAFTAR;
    private String jenisPaket = DEFAULT_JENIS_PAKET;

    /**
     * Constructor lengkap untuk membuat objek Member baru dengan seluruh data.
     * Mengisi nilai atribut melalui setter untuk memastikan validasi berjalan (prinsip DRY).
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon aktif member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket jenis paket keanggotaan (Basic, Premium, atau VIP)
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Constructor tanpa paket untuk membuat objek Member baru.
     * Memanggil constructor lengkap menggunakan kata kunci this(...)
     * dengan jenis paket otomatis diisi paket default (Basic).
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon aktif member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, PAKET_BASIC);
    }

    /**
     * Mengambil nama lengkap member.
     *
     * @return nama lengkap member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengubah nama lengkap member setelah melalui validasi.
     * Nama tidak boleh kosong atau hanya berisi spasi.
     * Jika tidak valid, nama lama dipertahankan dan pesan penolakan dicetak.
     *
     * @param nama nama lengkap member baru
     */
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong atau hanya berisi spasi.");
            return;
        }
        this.nama = nama;
    }

    /**
     * Mengambil nomor telepon aktif member.
     *
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengubah nomor telepon member setelah melalui validasi format.
     * Jika format tidak valid, nomor lama dipertahankan dan pesan
     * penolakan dicetak.
     *
     * @param noTelepon nomor telepon baru, wajib diawali angka 0
     *                  dan memiliki panjang minimal 10 digit
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null || !noTelepon.startsWith(AWALAN_TELEPON) || noTelepon.length() < MIN_PANJANG_TELEPON) {
            System.out.println("Nomor telepon harus diawali angka 0 dan minimal " + MIN_PANJANG_TELEPON + " digit.");
            return;
        }
        this.noTelepon = noTelepon;
    }

    /**
     * Mengambil tanggal pendaftaran pertama kali member bergabung.
     *
     * @return tanggal pendaftaran member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengubah tanggal pendaftaran member setelah melalui validasi non-kosong.
     * Jika tanggal tidak valid (null atau kosong), tanggal lama dipertahankan
     * dan pesan penolakan dicetak.
     *
     * @param tanggalDaftar tanggal pendaftaran baru (format bebas konsisten)
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar == null || tanggalDaftar.trim().isEmpty()) {
            System.out.println("Tanggal daftar tidak boleh kosong.");
            return;
        }
        this.tanggalDaftar = tanggalDaftar;
    }

    /**
     * Mengambil jenis paket keanggotaan aktif member.
     *
     * @return jenis paket keanggotaan (Basic, Premium, atau VIP)
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah jenis paket keanggotaan setelah melalui validasi.
     * Jenis paket hanya boleh: Basic, Premium, atau VIP (penulisan persis).
     * Jika tidak valid, paket lama dipertahankan dan pesan penolakan dicetak.
     *
     * @param jenisPaket jenis paket baru (Basic, Premium, atau VIP)
     */
    public void setJenisPaket(String jenisPaket) {
        if (jenisPaket == null || 
            (!jenisPaket.equals(PAKET_BASIC) && 
             !jenisPaket.equals(PAKET_PREMIUM) && 
             !jenisPaket.equals(PAKET_VIP))) {
            System.out.println("Jenis paket tidak valid. Pilihan hanya: " + PAKET_BASIC + ", " + PAKET_PREMIUM + ", atau " + PAKET_VIP + ".");
            return;
        }
        this.jenisPaket = jenisPaket;
    }

    /**
     * Mengembalikan representasi teks dari data member secara rapi dan berlabel.
     *
     * @return string berisi rincian data member yang terformat
     */
    @Override
    public String toString() {
        return "Member [Nama: " + nama + 
               ", No Telepon: " + noTelepon + 
               ", Tanggal Daftar: " + tanggalDaftar + 
               ", Jenis Paket: " + jenisPaket + "]";
    }
}
