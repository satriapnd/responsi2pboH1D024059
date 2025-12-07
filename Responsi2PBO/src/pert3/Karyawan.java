package pert3;

class Karyawan {
    protected String nama;
    protected double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    void tampilInfo() {
        System.out.printf("Nama: %s | Gaji Pokok: Rp %.1f%n", nama, gajiPokok);
    }
}