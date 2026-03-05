1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan.
Tidak harus.
Sebuah class yang akan dibuat array of object tidak wajib memiliki method. Class cukup memiliki atribut (variabel) saja untuk menyimpan data.
Method biasanya ditambahkan jika ingin memberikan fungsi atau operasi tertentu pada objek tersebut.

2. Apa yang dilakukan oleh kode program berikut?
Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];
jawaban:
Kode tersebut digunakan untuk membuat array objek Mahasiswa sebanyak 3 elemen.
Artinya:
Program menyiapkan tempat untuk 3 objek Mahasiswa
Tetapi objeknya belum dibuat, hanya tempatnya saja yang disediakan.

3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktor pada baris berikut?
Jawaban :
arrayOfMahasiswa[0] = new Mahasiswa();

Class Mahasiswa tidak memiliki konstruktor yang dibuat secara manual, tetapi Java secara otomatis membuat default constructor.

Karena adanya default constructor tersebut, objek Mahasiswa tetap bisa dibuat menggunakan:

new Mahasiswa();
4. Apa yang dilakukan oleh kode program berikut?
arrayOfMahasiswa[0] = new Mahasiswa();
arrayOfMahasiswa[0].nim = "244107060033";
arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
arrayOfMahasiswa[0].kelas = "SIB-1E";
arrayOfMahasiswa[0].ipk = (float) 3.75;
jawaban:
Kode tersebut digunakan untuk:

Membuat objek Mahasiswa pada indeks ke-0 dalam array.

Mengisi nilai atribut objek tersebut yaitu:

nim

nama

kelas

ipk

Sehingga objek mahasiswa pertama memiliki data tersebut.

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
Jawaban :
Class Mahasiswa dan MahasiswaDemo dipisahkan agar program lebih terstruktur dan mudah dikelola.

Mahasiswa → berisi atribut atau data mahasiswa.

MahasiswaDemo → berisi program utama (main) untuk menjalankan dan menguji objek.

Dengan pemisahan ini, kode menjadi lebih rapi, mudah dipahami, dan mudah dikembangkan.