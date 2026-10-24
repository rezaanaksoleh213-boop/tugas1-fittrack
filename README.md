# Remedial UTS PBO - Tugas 1: Sistem Keanggotaan Gym FitTrack

> **Dokumentasi & Panduan Alur Commit Harian (Periode 2 Minggu / 14 Hari)**  
> Repository ini dikerjakan secara bertahap dengan komitmen minimal 1 commit per hari untuk memenuhi kriteria penilaian konsistensi commit harian (bobot 10%) dan kejelasan pesan commit (bobot 10%).

---

## 📅 Jadwal & Panduan Commit Harian (14 Hari)

Gunakan tabel dan panduan di bawah ini sebagai acuan pengerjaan setiap hari.

| Hari | Target Tanggal | Tipe & Pesan Commit | Status | Ringkasan Pekerjaan |
| :---: | :---: | :--- | :---: | :--- |
| **1** | Hari 1 | `chore: buat struktur project dan .gitignore` | `[x] Selesai` | Membuat folder `src/` dan file `.gitignore` untuk mengabaikan `.class` dan `out/` |
| **1** | Hari 1 | `feat: tambah class Member dengan atribut dan getter setter` | `[x] Selesai` | Membuat kerangka class `Member` dengan 4 atribut private dan getter/setter dasar |
| **2** | Hari 2 | `feat: tambah validasi nama dan nomor telepon di setter` | `[x] Selesai` | Validasi `nama` (tidak kosong/spasi), `noTelepon` (awalan 0, min 10 digit), konstanta & nilai default aman |
| **3** | Hari 3 | `feat: tambah validasi jenis paket di setJenisPaket` | `[x] Selesai` | Menambahkan konstanta `Basic`, `Premium`, `VIP` dan validasi pada method `setJenisPaket` |
| **4** | Hari 4 | `feat: tambah constructor lengkap dan constructor tanpa paket` | `[x] Selesai` | Constructor 4 parameter memanggil setter, constructor 3 parameter memanggil `this(...)` default Basic |
| **5** | Hari 5 | `feat: override toString pada class Member` | `[x] Selesai` | Override method `toString()` dengan format berlabel rapi (Nama, No Telepon, Tgl Daftar, Paket) |
| **6** | Hari 6 | `feat: buat class TesFitTrack dengan struktur main` | `[x] Selesai` | Membuat `src/TesFitTrack.java` dengan method `main` dan inisialisasi array `Member[]` |
| **7** | Hari 7 | `feat: implementasi skenario pengujian 4 member dan validasi` | `[x] Selesai` | Instansiasi minimal 4 objek (3 paket berbeda, 1 tanpa paket), uji input salah saat constructor & setter |
| **8** | Hari 8 | `feat: cetak seluruh data member dengan perulangan for` | `[x] Selesai` | Menampilkan seluruh isi array objek Member menggunakan perulangan `for` dan `toString()` |
| **9** | Hari 9 | `docs: tambah Javadoc lengkap pada class dan method TesFitTrack` | `[x] Selesai` | Menambahkan Javadoc standar pada class `TesFitTrack` dan method `main` |
| **10** | Hari 10 | `docs: lengkapi Javadoc pada seluruh method di class Member` | `[x] Selesai` | Melengkapi dokumentasi Javadoc untuk seluruh getter, setter, dan constructor di `Member.java` |
| **11** | Hari 11 | `docs: lengkapi identitas praktikan dan deskripsi program di README` | `[x] Selesai` | Mengisi nama lengkap, NPM, kelas, dan ringkasan studi kasus di `README.md` |
| **12** | Hari 12 | `docs: lengkapi tabel konsep OOP dan nilai default di README` | `[x] Selesai` | Menjelaskan konsep enkapsulasi, constructor overloading, DRY, dan alasan nilai default di `README.md` |
| **13** | Hari 13 | `docs: tambahkan panduan eksekusi dan contoh output di README` | `[x] Selesai` | Menambahkan screenshot/teks output hasil running normal dan kasus penolakan validasi |
| **14** | Hari 14 | `style: perapihan format kode dan verifikasi checklist pengumpulan` | `[x] Selesai` | Reformat code rapi, hapus debugging sementara, dan cek ulang daftar periksa sebelum submit |

---

## 🛠️ Panduan Perintah Git Harian

Setiap kali Anda selesai mengerjakan tugas untuk suatu hari:

1. **Periksa status perubahan:**
   ```bash
   git status
   ```
2. **Tambahkan file yang diubah ke staging:**
   ```bash
   git add <nama-file>
   # contoh: git add src/Member.java
   ```
3. **Lakukan commit dengan pesan yang sesuai jadwal di atas:**
   ```bash
   git commit -m "tipe: deskripsi perubahan hari ini"
   # contoh hari ke-3:
   # git commit -m "feat: tambah validasi jenis paket di setJenisPaket"
   ```
4. **Kirim commit ke GitHub:**
   ```bash
   git push origin main
   ```

---

## 📖 Draf Isi Laporan README (Sesuai Ketentuan Halaman 6 PDF)

*(Bagian di bawah ini akan terus dilengkapi hingga Hari ke-14 sebagai laporan akhir yang dinilai asisten lab)*

### 1. Judul dan Identitas
- **Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek
- **Tugas:** Remedial UTS / Tugas 1 - Sistem Keanggotaan Gym FitTrack
- **Nama Lengkap:** Reza Nurhakim
- **NPM:** 250810701100054
- **Kelas:** Kelas Praktikum Pemrograman Berorientasi Objek

### 2. Deskripsi Singkat
FitTrack adalah program pendataan keanggotaan gym berbasis Java console yang dirancang sebagai langkah awal digitalisasi pencatatan data member FitTrack yang sebelumnya manual. Program ini menjawab permasalahan pencatatan buku fisik yang sering tercecer, sulit dibaca, dan tidak efisien dengan menyediakan penyimpanan data member sementara selama aplikasi berjalan. Fokus utama sistem ini adalah menjamin validitas seluruh data (nama, awalan dan panjang nomor telepon, serta paket keanggotaan) menggunakan mekanisme validasi terpusat di setter serta penanganan nilai default yang aman saat data tidak valid.

### 3. Fitur Utama
- **Validasi Nama:** Menolak nama yang kosong atau hanya terdiri dari karakter spasi.
- **Validasi Nomor Telepon:** Memastikan nomor telepon aktif diawali angka 0 dan memiliki panjang minimal 10 digit.
- **Validasi Paket Keanggotaan:** Membatasi pilihan paket hanya pada `Basic`, `Premium`, atau `VIP`.
- **Constructor Overloading:** Fleksibilitas pembuatan member baru baik dengan spesifikasi paket lengkap maupun paket otomatis (`Basic`).
- **Pelaporan Data Member Terformat:** Mencetak representasi data member secara rapi dan terstruktur menggunakan perulangan array.

### 4. Konsep OOP yang Diterapkan

| No | Konsep OOP | Lokasi Penerapan (Class / Method / Baris) | Alasan Pemilihan |
| :---: | :--- | :--- | :--- |
| 1 | **Encapsulation** | Class `Member` — seluruh atribut bertipe `private`, akses hanya melalui `getter`/`setter` bertipe `public` | Melindungi data internal member dari modifikasi langsung di luar class. Setiap perubahan wajib melewati setter yang berisi logika validasi, sehingga integritas data terjaga secara terpusat. |
| 2 | **Prinsip DRY (Don't Repeat Yourself)** | Constructor `Member(String, String, String, String)` — memanggil `setNama()`, `setNoTelepon()`, `setTanggalDaftar()`, `setJenisPaket()` | Menghindari duplikasi aturan validasi antara constructor dan setter. Jika aturan validasi berubah di kemudian hari, cukup diubah sekali di setter tanpa harus menyentuh constructor. |
| 3 | **Constructor Overloading & `this(...)`** | Constructor `Member(String, String, String)` — memanggil `this(nama, noTelepon, tanggalDaftar, PAKET_BASIC)` | Menyediakan fleksibilitas pembuatan objek member: jika paket tidak diisi, otomatis menggunakan paket `Basic` tanpa duplikasi kode inisialisasi. Memanfaatkan keyword `this(...)` untuk mendelegasikan ke constructor utama. |
| 4 | **Polymorphism (Method Overriding)** | Method `toString()` pada class `Member` — menggantikan `Object.toString()` | Mengubah representasi bawaan Java (alamat memori seperti `Member@1a2b3c`) menjadi format teks berlabel yang informatif dan mudah dibaca oleh pengguna saat mencetak data member ke konsol. |
| 5 | **Array of Objects** | Array `Member[]` pada class `TesFitTrack` — `daftarMember = new Member[JUMLAH_MEMBER]` | Menyimpan sekumpulan objek member dalam satu struktur data terpadu sehingga dapat diproses secara kolektif menggunakan perulangan `for`, sesuai dengan skenario pengujian yang diminta di spesifikasi tugas. |
| 6 | **Penggunaan Konstanta (`static final`)** | Class `Member` — `PAKET_BASIC`, `PAKET_PREMIUM`, `PAKET_VIP`, `AWALAN_TELEPON`, `MIN_PANJANG_TELEPON`, seluruh `DEFAULT_*` | Menghindari penggunaan magic number dan magic string. Memudahkan pemeliharaan kode: jika batas minimum digit nomor telepon berubah, cukup ubah satu konstanta. Meningkatkan keterbacaan dan konsistensi kode. |

### 5. Struktur Project
```text
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── out/
├── .gitignore
└── README.md
```

### 6. Prasyarat Lingkungan Pengembangan
- **Java Development Kit (JDK):** Versi 17 atau lebih baru
- **Integrated Development Environment (IDE):** IntelliJ IDEA / VS Code / NetBeans

### 7. Cara Menjalankan Program (Panduan Eksekusi)

#### Opsi 1: Melalui Command Line / Terminal
1. Buka terminal (PowerShell / Command Prompt / Bash) dan arahkan ke direktori root project:
   ```bash
   cd tugas1-fittrack
   ```
2. Kompilasi seluruh file Java yang berada di dalam folder `src/` ke dalam folder `out/`:
   ```bash
   javac -d out src/*.java
   ```
3. Eksekusi driver class utama `TesFitTrack`:
   ```bash
   java -cp out TesFitTrack
   ```

#### Opsi 2: Melalui Integrated Development Environment (IDE)
1. **VS Code:**
   - Buka folder `tugas1-fittrack` di VS Code.
   - Pastikan *Extension Pack for Java* sudah terpasang.
   - Buka file [src/TesFitTrack.java](file:///c:/Users/Hype%207%20AMD%20X8/Downloads/RemedialUtsPBO/tugas1-fittrack/src/TesFitTrack.java).
   - Klik tombol **Run** atau **Debug** di atas method `main`.
2. **IntelliJ IDEA:**
   - Buka direktori `tugas1-fittrack` sebagai project.
   - Set folder `src/` sebagai *Sources Root*.
   - Buka [TesFitTrack.java](file:///c:/Users/Hype%207%20AMD%20X8/Downloads/RemedialUtsPBO/tugas1-fittrack/src/TesFitTrack.java) lalu klik ikon panah hijau (**Run 'TesFitTrack.main()'**).

---

### 8. Contoh Output Program

Berikut adalah hasil eksekusi program `TesFitTrack` pada konsol:

```text
==================================================
       SISTEM PENDATAAN MEMBER GYM FITTRACK       
==================================================

--- 1. Pendaftaran Member ke Sistem ---
Member 1 berhasil didaftarkan.
Member 2 berhasil didaftarkan.
Member 3 berhasil didaftarkan.

Pendaftaran Member 4 (Skenario input nomor telepon salah saat pembuatan):
Nomor telepon harus diawali angka 0 dan minimal 10 digit.
Member 4 berhasil didaftarkan dengan nomor telepon default aman.

--- 2. Pengujian Validasi Setter (Nilai Lama Harus Bertahan) ---
Nomor telepon Member 1 saat ini: 081234567890
Mencoba mengubah nomor telepon Member 1 dengan format salah (tidak diawali 0)...
Nomor telepon harus diawali angka 0 dan minimal 10 digit.
Nomor telepon Member 1 setelah dicoba ubah: 081234567890

--- 3. Daftar Seluruh Data Member FitTrack ---
1. Member [Nama: Budi Santoso, No Telepon: 081234567890, Tanggal Daftar: 15-08-2026, Jenis Paket: Basic]
2. Member [Nama: Siti Rahma, No Telepon: 085678901234, Tanggal Daftar: 16-08-2026, Jenis Paket: Premium]
3. Member [Nama: Ahmad Fauzi, No Telepon: 087812345678, Tanggal Daftar: 17-08-2026, Jenis Paket: VIP]
4. Member [Nama: Rian Pratama, No Telepon: 080000000000, Tanggal Daftar: 18-08-2026, Jenis Paket: Basic]
```

#### Analisis Skenario Output:
1. **Skenario Constructor 3 Parameter (Default Paket):**
   - Member 1 didaftarkan hanya dengan nama, nomor telepon, dan tanggal daftar. Sistem otomatis menetapkan paket `Basic` menggunakan delegasi `this(...)`.
2. **Skenario Tiga Paket Berbeda:**
   - Member 1 memiliki paket `Basic`, Member 2 memiliki paket `Premium`, dan Member 3 memiliki paket `VIP`, membuktikan ketiga konstanta paket valid dan dapat diterima.
3. **Skenario Penolakan Input Salah saat Instansiasi (Constructor):**
   - Member 4 diinstansiasi dengan nomor telepon tidak valid (`"123"`). Sistem menolak input tersebut dengan pesan peringatan *"Nomor telepon harus diawali angka 0 dan minimal 10 digit."* dan otomatis mengamankan data dengan menetapkan `DEFAULT_NO_TELEPON` (`080000000000`).
4. **Skenario Penolakan Input Salah pada Setter (Nilai Lama Bertahan):**
   - Pada bagian pengujian setter, Member 1 dicoba diubah nomor teleponnya menjadi `"999"`. Validasi setter menolak perubahan dan mempertahankan nilai lama (`081234567890`), membuktikan bahwa data tidak rusak atau menjadi `null`.
5. **Skenario Tampilan Seluruh Member:**
   - Seluruh data member dalam array berhasil dicetak menggunakan perulangan `for` dengan memanggil format rapi berlabel dari method override `toString()`.

---

### 9. Penjelasan Pemilihan Nilai Default Saat Data Tidak Valid

Setiap atribut pada class `Member` dilengkapi dengan nilai default yang aman. Berikut alasan pemilihan masing-masing:

| Atribut | Konstanta Default | Nilai | Alasan Pemilihan |
| :--- | :--- | :--- | :--- |
| `nama` | `DEFAULT_NAMA` | `"Member Baru"` | Dipilih agar sistem tetap mengenali bahwa ada entitas member yang terdaftar meskipun nama belum diisi. Staf resepsionis dapat segera mengidentifikasi dan memperbarui nama member tersebut kemudian. |
| `noTelepon` | `DEFAULT_NO_TELEPON` | `"080000000000"` | Memenuhi kedua kriteria validasi (diawali angka `0` dan panjang minimal 10 digit) sekaligus menandakan nomor dummy yang jelas bukan nomor asli, sehingga perlu dikonfirmasi ulang ke member. |
| `jenisPaket` | `DEFAULT_JENIS_PAKET` | `"Basic"` (via `PAKET_BASIC`) | Sesuai spesifikasi tugas, paket paling aman dan mendasar adalah tier `Basic`. Jika member belum menentukan pilihan, paket dasar otomatis diterapkan tanpa risiko pembebanan biaya tinggi. |
| `tanggalDaftar` | `DEFAULT_TANGGAL_DAFTAR` | `"01-01-2026"` | Format tanggal standar konsisten `DD-MM-YYYY` sebagai fallback awal tahun. Memastikan atribut tidak pernah bernilai `null` saat diakses, sehingga program berjalan tanpa `NullPointerException`. |

---

### 10. Batasan dan Pengembangan Lanjutan
- **Penyimpanan Sementara (In-Memory):** Data masih disimpan dalam array memori lokal sehingga akan tereset ketika program ditutup.
- **Pengembangan Lanjutan:** Di masa mendatang sistem dapat dihubungkan ke basis data (seperti MySQL/SQLite) serta dilengkapi antarmuka grafis (GUI) atau pencarian member berdasarkan ID.

---

### 11. Daftar Periksa Akhir (Checklist Verifikasi Tugas)

Tabel berikut memverifikasi pemenuhan seluruh kriteria tugas remedial sebelum pengumpulan akhir:

| No | Kriteria Penilaian / Spesifikasi | Status | Catatan Verifikasi |
| :---: | :--- | :---: | :--- |
| 1 | **Struktur Project & File Git** | `[x]` | Terdiri dari `src/Member.java`, `src/TesFitTrack.java`, `.gitignore`, dan `README.md`. |
| 2 | **Enkapsulasi Ketat** | `[x]` | Seluruh 4 atribut pada `Member` bertipe `private`, akses hanya lewat getter/setter `public`. |
| 3 | **Validasi Atribut Lengkap** | `[x]` | Validasi nama (tidak kosong/spasi), no telepon (awalan 0, min 10 digit), paket (`Basic`, `Premium`, `VIP`). |
| 4 | **Konstanta & Nilai Default Aman** | `[x]` | Menggunakan `static final` untuk paket dan validasi; nilai default aman mencegah `null` / crash. |
| 5 | **Constructor Overloading & DRY** | `[x]` | Constructor 4-param mendelegasikan validasi ke setter; constructor 3-param memanggil `this(...)`. |
| 6 | **Override toString()** | `[x]` | Format output berlabel rapi menggantikan representasi default memori Java. |
| 7 | **Pengujian Driver Class (`TesFitTrack`)** | `[x]` | Minimal 4 member, 3 paket berbeda, 1 tanpa paket, uji input salah constructor & setter, loop `for`. |
| 8 | **Dokumentasi Javadoc** | `[x]` | Javadoc standar lengkap pada setiap class, konstanta, constructor, dan method. |
| 9 | **Laporan Lengkap di README.md** | `[x]` | Memuat identitas, deskripsi, fitur, tabel OOP, instruksi eksekusi, contoh output, dan analisis default. |
| 10 | **Konsistensi Commit Harian (14 Hari)** | `[x]` | Seluruh 14 tahap commit harian terlaksana secara bertahap dan berpola pesan konvensional. |


