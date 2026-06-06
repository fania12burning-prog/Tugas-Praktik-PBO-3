/**
 * Kelas Makanan - Subkelas dari MenuItem
 * Merepresentasikan item makanan dalam menu restoran
 */
public class Makanan extends MenuItem {
    private String jenisMakanan; // Contoh: "Nasi", "Mie", "Ayam", dll

    /**
     * Konstruktor Makanan
     * @param nama nama makanan
     * @param harga harga makanan
     * @param kategori kategori makanan
     * @param jenisMakanan jenis makanan
     */
    public Makanan(String nama, double harga, String kategori, String jenisMakanan) {
        super(nama, harga, kategori);
        this.jenisMakanan = jenisMakanan;
    }

    // Getter dan Setter untuk jenisMakanan
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    /**
     * Implementasi metode abstrak tampilMenu() - Polymorphism
     */
    @Override
    public void tampilMenu() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║         INFORMASI MAKANAN          ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.printf("║ Nama          : %-21s ║\n", getNama());
        System.out.printf("║ Harga         : Rp %,.0f          ║\n", getHarga());
        System.out.printf("║ Kategori      : %-21s ║\n", getKategori());
        System.out.printf("║ Jenis Makanan : %-21s ║\n", jenisMakanan);
        System.out.println("╚════════════════════════════════════╝");
    }

    /**
     * Format untuk menyimpan ke file
     */
    @Override
    public String toFileFormat() {
        return "MAKANAN|" + getNama() + "|" + getHarga() + "|" + getKategori() + "|" + jenisMakanan;
    }
}
