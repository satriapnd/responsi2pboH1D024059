package pert6;

abstract class KendaraanGalaksi {

    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public final void tampilStatus() {
        System.out.printf("%s | Energi: %d%% | Kapasitas: %d awak%n",
                namaKendaraan, levelEnergi, kapasitasPenumpang);
    }

    protected void kurangiEnergi(int konsumsi) {
        levelEnergi -= konsumsi;
        if (levelEnergi < 0) {
            levelEnergi = 0;
        }
    }

    protected void tambahEnergi(int jumlah) {
        levelEnergi += jumlah;
        if (levelEnergi > 100) {
            levelEnergi = 100;
        }
    }

    public abstract void aktifkanMesin();

    public abstract void jelajah(int jarak);

    public abstract void isiEnergi(int jumlah);
}