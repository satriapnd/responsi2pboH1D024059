package pert5;

class defaultMesin {
    protected String namaMesin;
    protected int tenagaHP;

    defaultMesin(String nama, int hp) {
        this.namaMesin = nama;
        this.tenagaHP = hp;
    }

    void tampilInfo() {
        System.out.printf("Mesin %s | Tenaga: %d HP%n", namaMesin, tenagaHP); //
    }

    double nilaiPerforma() {
        return tenagaHP * 1.0; //
    }

    String kategoriMesin() {
        return "Mesin Umum"; //
    }
}