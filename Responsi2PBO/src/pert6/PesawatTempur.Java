package pert6;

class PesawatTempur extends KendaraanGalaksi {

    private int jumlahRudal;
    private final int ENERGI_PER_KM = 3;

    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsiEnergi = jarak * ENERGI_PER_KM;

        if (getLevelEnergi() < konsumsiEnergi) {
            System.out.printf("Energi tidak mencukupi untuk menjelajah sejauh %d km.%n", jarak);
        } else {
            kurangiEnergi(konsumsiEnergi);
            System.out.printf("Pesawat tempur menjelajah sejauh %d km.%n", jarak);
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        tambahEnergi(jumlah);
        System.out.printf("Energi pesawat tempur ditingkatkan sebesar %d poin.%n", jumlah);
    }

    public void tembakRudal(int jumlah) {
        if (this.jumlahRudal >= jumlah) {
            this.jumlahRudal -= jumlah;
            System.out.printf("Menembakkan %d rudal!%n", jumlah);
        } else {
            System.out.println("Gagal menembak! Jumlah rudal tidak mencukupi.");
        }
    }
}