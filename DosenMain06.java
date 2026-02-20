public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 dosen1 = new Dosen06();
        dosen1.idDosen = "PYS";
        dosen1.nama = "Pramana Yoga Saputra, S.Kom., MMT.";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2020;
        int masaKerja = dosen1.hitungMasaKerja(2026);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        dosen1.bidangKeahlian = "Algoritma dan Struktur Data";
        
        dosen1.tampilInformasi();

        Dosen06 dosen2 = new Dosen06("AFP", "Elok Nur Hamdana, S.T., MT", false, 2018, "Basis Data");
        dosen2.tampilInformasi();
    }
}
