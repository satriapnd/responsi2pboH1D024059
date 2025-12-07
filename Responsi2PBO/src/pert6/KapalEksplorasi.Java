package pert6;

class KapalEksplorasi extends KendaraanGalaksi {

    private int modulScan;
    private final int ENERGI_PER_KM = 2;

    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsiEnergi = jarak * ENERGI_PER_KM;

        if (getLevelEnergi() < konsumsiEnergi) {
            System.out.printf("Energi tidak mencukupi untuk menjelajah sejauh %d km.%n", jarak);
        } else {
            kurangiEnergi(konsumsiEnergi);
            System.out.printf("Kapal eksplorasi menjelajah sejauh %d km.%n", jarak);
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        tambahEnergi(jumlah);
        System.out.printf("Pengisian energi kapal eksplorasi sebesar %d poin selesai.%n", jumlah);
    }

    public void scanPlanet(String namaPlanet) {
        System.out.printf("Melakukan scan pada planet %s dengan modul level %d.%n",
                namaPlanet, modulScan);
    }
}