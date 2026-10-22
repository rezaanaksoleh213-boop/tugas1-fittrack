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
| **12** | Hari 12 | `docs: lengkapi tabel konsep OOP dan nilai default di README` | `[ ] Pending` | Menjelaskan konsep enkapsulasi, constructor overloading, DRY, dan alasan nilai default di `README.md` |
| **13** | Hari 13 | `docs: tambahkan panduan eksekusi dan contoh output di README` | `[ ] Pending` | Menambahkan screenshot/teks output hasil running normal dan kasus penolakan validasi |
| **14** | Hari 14 | `style: perapihan format kode dan verifikasi checklist pengumpulan` | `[ ] Pending` | Reformat code rapi, hapus debugging sementara, dan cek ulang daftar periksa sebelum submit |

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
- **Nama Lengkap:** [Isi Nama Anda]
- **NPM:** [Isi NPM Anda]
- **Kelas:** [Isi Kelas Praktikum Anda]

### 2. Deskripsi Singkat
FitTrack adalah program pendataan keanggotaan gym berbasis Java console yang dirancang sebagai langkah awal digitalisasi pencatatan data member FitTrack yang sebelumnya manual. Program ini menjawab permasalahan pencatatan buku fisik yang sering tercecer, sulit dibaca, dan tidak efisien dengan menyediakan penyimpanan data member sementara selama aplikasi berjalan. Fokus utama sistem ini adalah menjamin validitas seluruh data (nama, awalan dan panjang nomor telepon, serta paket keanggotaan) menggunakan mekanisme validasi terpusat di setter serta penanganan nilai default yang aman saat data tidak valid.

### 3. Fitur Utama
- **Validasi Nama:** Menolak nama yang kosong atau hanya terdiri dari karakter spasi.
- **Validasi Nomor Telepon:** Memastikan nomor telepon aktif diawali angka 0 dan memiliki panjang minimal 10 digit.
- **Validasi Paket Keanggotaan:** Membatasi pilihan paket hanya pada `Basic`, `Premium`, atau `VIP`.
- **Constructor Overloading:** Fleksibilitas pembuatan member baru baik dengan spesifikasi paket lengkap maupun paket otomatis (`Basic`).
- **Pelaporan Data Member Terformat:** Mencetak representasi data member secara rapi dan terstruktur menggunakan perulangan array.

### 4. Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan | Alasan Pemilihan |
| :--- | :--- | :--- |
| **Encapsulation** | Class `Member` (atribut `private`, method `getter`/`setter` `public`) | Melindungi atribut data member dari modifikasi langsung di luar class dan memusatkan logika validasi. |
| **Prinsip DRY (Don't Repeat Yourself)** | Constructor class `Member` memanggil `setter` | Menghindari duplikasi aturan validasi antara constructor dan setter. |
| **Constructor Overloading & `this(...)`** | Constructor 3 parameter memanggil constructor 4 parameter dengan `this(...)` | Memudahkan pembuatan member tanpa harus mengisi paket secara manual (otomatis `Basic`). |
| **Polymorphism (Method Overriding)** | Method `toString()` pada class `Member` | Menggantikan representasi bawaan memori Java (`Object.toString`) dengan format teks yang berlabel dan informatif. |
| **Array of Objects** | Array `Member[]` pada class `TesFitTrack` | Menyimpan sekumpulan data member dalam satu struktur data terpadu untuk diproses secara kolektif. |

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

### 7. Cara Menjalankan Program
#### Melalui Command Line / Terminal:
1. Masuk ke direktori root project:
   ```bash
   cd tugas1-fittrack
   ```
2. Kompilasi source code:
   ```bash
   javac -d out src/*.java
   ```
3. Jalankan class utama pengujian:
   ```bash
   java -cp out TesFitTrack
   ```

### 8. Penjelasan Pemilihan Nilai Default Saat Data Tidak Valid
1. **Nama (`DEFAULT_NAMA = "Member Baru"`):** Dipilih agar sistem tetap mengenali bahwa ada entitas member yang terdaftar dan staf dapat segera mengidentifikasi untuk memperbarui nama member tersebut kemudian.
2. **Nomor Telepon (`DEFAULT_NO_TELEPON = "080000000000"`):** Memenuhi kriteria minimal 10 digit dan diawali angka 0, sekaligus menandakan nomor dummy yang perlu dikonfirmasi ulang ke member.
3. **Jenis Paket (`DEFAULT_JENIS_PAKET = "Basic"`):** Sesuai spesifikasi tugas, paket default paling aman dan mendasar adalah tier `Basic`.
4. **Tanggal Daftar (`DEFAULT_TANGGAL_DAFTAR = "01-01-2026"`):** Format tanggal standar konsisten `DD-MM-YYYY` sebagai fallback jika tanggal tidak terisi.

### 9. Batasan dan Pengembangan Lanjutan
- **Penyimpanan Sementara (In-Memory):** Data masih disimpan dalam array memori lokal sehingga akan tereset ketika program ditutup.
- **Pengembangan Lanjutan:** Di masa mendatang sistem dapat dihubungkan ke basis data (seperti MySQL/SQLite) serta dilengkapi antarmuka grafis (GUI) atau pencarian member berdasarkan ID.
