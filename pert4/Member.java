package pert4;

class Member extends Customer {
    private int poinReward;
    private String levelKeanggotaan;

    public Member(String namaLengkap, String noIdentitasCustomer, int totalBelanja,
                  int poinReward, String levelKeanggotaan) {

        super(namaLengkap, noIdentitasCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.levelKeanggotaan = levelKeanggotaan;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf("Poin Reward: %d | Level: %s%n", poinReward, levelKeanggotaan);
    }
}