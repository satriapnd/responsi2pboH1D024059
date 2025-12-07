package pert3;
class UjiKaryawan {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");
        Karyawan k1 = new Karyawan("Budi Santoso", 4000000.0);
        Manajer m1 = new Manajer("Siti Aminah", 6000000.0, 2500000.0);
        k1.tampilInfo();
        m1.tampilInfo();
        
    }
}