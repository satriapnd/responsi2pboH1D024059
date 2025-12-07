package pert4;

class Customer {
    protected String namaLengkap;
    protected String noIdentitasCustomer;
    protected int totalBelanja;

    public Customer(String namaLengkap, String noIdentitasCustomer, int totalBelanja) {
        this.namaLengkap = namaLengkap;
        this.noIdentitasCustomer = noIdentitasCustomer;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        System.out.printf("Nama: %s | ID: %s | Total Belanja: Rp %d%n",
                namaLengkap, noIdentitasCustomer, totalBelanja);
    }
}