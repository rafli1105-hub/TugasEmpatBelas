# TugasEmpatBelas

# Petunjuk

# 1.	Siapkan Project
o	Buka NetBeans → buat project baru dengan dukungan JPA.

# 2.	Buat Persistence Unit
o	Klik kanan pada package → New → Entity Classes from Database.
o	Pilih koneksi database → pilih tabel user/akun_login → Next → Finish.
# 3.	Buat Entity Class
o	Sesuaikan dengan kolom tabel (id, username, password, role).
# 4.	Buat DAO
o	Tambahkan fungsi cekLogin(username, password) untuk validasi akun.
# 5.	Buat Form Login
o	Gunakan Swing: field username, password, tombol Login & Batal.
o	Saat Login ditekan → panggil DAO → cek akun.
# 6.	Tambahkan Validasi
o	Cek field kosong.
o	Tampilkan pesan jika login gagal.
# 7.	Keamanan
o	Hash password sebelum disimpan (misalnya MD5/SHA-256).
o	Jangan tampilkan password di log.
o	Gunakan PreparedStatement untuk mencegah SQL Injection.
# 8.	Download & Testing
o	Jalankan project → masukkan username & password.
o	Test login benar, salah, dan kondisi field kosong.
**
