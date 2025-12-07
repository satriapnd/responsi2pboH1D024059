package pert5;

class mesinTraktor extends defaultMesin {
    protected double kapasitasTarik;

    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        System.out.printf("Mesin Traktor %s | Tarik: %.1f ton | Tenaga: %d HP%n", namaMesin, kapasitasTarik, tenagaHP); //
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 0.9) + (kapasitasTarik * 10); //
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor"; //
    }

    void suaraMesin() {
        System.out.println("GGGRRRR! Hidup Mesinnn!"); //
    }
}