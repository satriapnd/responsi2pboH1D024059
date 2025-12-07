package pert3;

class Manajer extends Karyawan {
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    void tampilInfo() {
        double totalGaji = gajiPokok + tunjangan;

        System.out.printf("Nama: %s | Gaji Pokok: Rp %.1f | Tunjangan: Rp %.1f%n",
                nama, gajiPokok, tunjangan);
        System.out.printf("Total Pendapatan: Rp %.1f%n", totalGaji);
    }
}