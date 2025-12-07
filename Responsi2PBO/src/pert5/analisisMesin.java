package pert5;

import java.util.Arrays;
import java.util.Comparator;

class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] inventaris = new defaultMesin[5];
        inventaris[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventaris[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        inventaris[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70.0);
        inventaris[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        inventaris[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80.0);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin mesin : inventaris) {
            mesin.tampilInfo();
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.printf("Performa: %.1f%n%n", mesin.nilaiPerforma());
        }

        System.out.println("=== SUARA MESIN ===");


        for (defaultMesin mesin : inventaris) {
            if (mesin instanceof mesinMotor) {
                ((mesinMotor) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktor) {
                ((mesinTraktor) mesin).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");


        defaultMesin mesinTerbaik = inventaris[0];
        double performaTertinggi = mesinTerbaik.nilaiPerforma();

        for (int i = 1; i < inventaris.length; i++) {
            if (inventaris[i].nilaiPerforma() > performaTertinggi) {
                performaTertinggi = inventaris[i].nilaiPerforma();
                mesinTerbaik = inventaris[i];
            }
        }
        System.out.printf("%s → %.1f%n", mesinTerbaik.namaMesin, performaTertinggi);

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");


        Arrays.sort(inventaris, Comparator.comparing(defaultMesin::nilaiPerforma).reversed());

        for (int i = 0; i < Math.min(3, inventaris.length); i++) {
            System.out.printf("%d. %s → %.1f%n", (i + 1), inventaris[i].namaMesin, inventaris[i].nilaiPerforma());
        }
    }
}