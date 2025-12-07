package pert8;


class ProgrammerMagang implements KaryawanKontrak, AksesSistem { //
    private String nama; //
    private double gajiPerJam; //
    private String pinRahasia; //
    private boolean sedangLogin; //

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) { //
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false; //
    }

    @Override
    public double hitungGaji(int jamKerja) { //
        double totalGaji = jamKerja * gajiPerJam; //
        System.out.printf("Gaji %s (%d jam) adalah: Rp %.1f%n", nama, jamKerja, totalGaji); //
        return totalGaji;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) { //
        System.out.printf("Kontrak diperpanjang %d bulan.%n", durasiBulan); //
    }

    @Override
    public String getStatusCuti() { //
        return "Tersedia 5 hari"; //
    }

    @Override
    public void login(String pin) { //
        if (this.pinRahasia.equals(pin)) {
            this.sedangLogin = true; //
            System.out.printf("Login Berhasil. Selamat datang, %s!%n", this.nama); //
        } else {
            System.out.println("Login Gagal: PIN salah."); //
        }
    }

    @Override
    public void logout() { //
        this.sedangLogin = false; //
        System.out.printf("%s berhasil logout.%n", this.nama); //
    }

    @Override
    public String getRoleAkses() { //
        return "Magang IT"; //
    }
}