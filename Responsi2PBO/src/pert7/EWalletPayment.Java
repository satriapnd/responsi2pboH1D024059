package pert7;

class EWalletPayment implements PaymentMethod {
    private String namaPenyedia;
    private double saldo;
    private double nominalTransaksi;
    private final double TRANSACTION_FEE = 2000.0;


    public EWalletPayment(String namaPenyedia, double saldo, double nominalTransaksi) {
        this.namaPenyedia = namaPenyedia;
        this.saldo = saldo;
        this.nominalTransaksi = nominalTransaksi;
    }


    @Override
    public String processPayment() {
        double totalBiaya = nominalTransaksi + getTransactionFee();
        if (this.saldo >= totalBiaya) {
            this.saldo -= totalBiaya;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + this.namaPenyedia;
    }

    @Override
    public double getTransactionFee() {
        return TRANSACTION_FEE;
    }

    @Override
    public double getBalance() {
        return this.saldo;
    }
}