public class MataKuliahMain06 {
    public static void main(String[] args) {
        MataKuliah06 mk1 = new MataKuliah06();
        mk1.kodeMK = "ASD1";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.ubahSks(2);
        mk1.tambahJam(2);
        mk1.tampilInformasi();

        MataKuliah06 mk2 = new MataKuliah06("BD1", "Basis Data", 3, 3);
        mk2.ubahSks(4);
        mk2.tambahJam(1);
        mk2.tampilInformasi();
    }
}
