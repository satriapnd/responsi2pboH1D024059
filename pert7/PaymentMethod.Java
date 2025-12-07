package pert7;

interface PaymentMethod {
    String processPayment();
    String getPaymentDetails();
    double getTransactionFee();
    double getBalance();
}