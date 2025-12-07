package pert5;

class mesinTraktorListrik extends mesinTraktor {
    private double kapasitasBaterai;

    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        System.out.printf("Mesin Traktor Listrik %s | Tarik: %.1f ton | Baterai: %.1f kWh | Tenaga: %d HP%n",
                namaMesin, kapasitasTarik, kapasitasBaterai, tenagaHP); //
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 1.1) + (kapasitasBaterai * 5); //
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor Listrik"; //
    }

    @Override
    void suaraMesin() {
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!"); //
    }
}