/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member dan memastikan setiap
 * perubahan data lolos validasi sebelum disimpan.
 */
public class Member {
    // Konstanta pilihan jenis paket keanggotaan
    public static final String PAKET_BASIC = "Basic";
    public static final String PAKET_PREMIUM = "Premium";
    public static final String PAKET_VIP = "VIP";

    // Konstanta batas validasi nomor telepon
    private static final String AWALAN_TELEPON = "0";
    private static final int MIN_PANJANG_TELEPON = 10;

    // Nilai default yang aman jika data tidak valid
    private static final String DEFAULT_NAMA = "Member Baru";
    private static final String DEFAULT_NO_TELEPON = "080000000000";
    private static final String DEFAULT_TANGGAL_DAFTAR = "01-01-2026";
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
     * @param noTelepon nomor telepon member
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
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon, String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, PAKET_BASIC);
    }

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

    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar == null || tanggalDaftar.trim().isEmpty()) {
            System.out.println("Tanggal daftar tidak boleh kosong.");
            return;
        }
        this.tanggalDaftar = tanggalDaftar;
    }

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
