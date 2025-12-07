package pert7;

class PaymentTest {

    public static void main(String[] args) {
        double saldoAwal = 150000.0;
        double nominalBayar = 50000.0;

        EWalletPayment ovoPayment = new EWalletPayment("OVO", saldoAwal, nominalBayar);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        System.out.printf("Saldo awal: %.0f%n", ovoPayment.getBalance());
        System.out.printf("Memproses pembayaran sebesar %.0f...%n", nominalBayar);

        System.out.println(ovoPayment.processPayment());

        System.out.printf("Sisa saldo: %.0f%n", ovoPayment.getBalance());
        System.out.println("Detail Transaksi: " + ovoPayment.getPaymentDetails());
    }
}