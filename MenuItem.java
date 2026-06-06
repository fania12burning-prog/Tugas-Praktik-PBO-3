/**
 * Kelas abstrak MenuItem - Kelas dasar untuk semua item menu restoran
 * Mengimplementasikan konsep abstraksi dalam pemrograman berorientasi objek
 */
public abstract class MenuItem {
    // Atribut-atribut MenuItem
    private String nama;
    private double harga;
    private String kategori;

    /**
     * Konstruktor MenuItem
     * @param nama nama item menu
     * @param harga harga item menu
     * @param kategori kategori item menu
     */
    public MenuItem(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Getter dan Setter (Encapsulation)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    /**
     * Metode abstrak tampilMenu() yang harus diimplementasikan oleh kelas turunan
     * Menggunakan konsep polymorphism
     */
    public abstract void tampilMenu();

    /**
     * Metode untuk mendapatkan format string dari MenuItem
     */
    public String toFileFormat() {
        return "";
    }
}
