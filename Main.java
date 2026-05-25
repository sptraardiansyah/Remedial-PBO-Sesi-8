public class Main {
    public static void main(String[] args) {

        Mobil mobil1 = new Mobil("M001", "Toyota", 2023, 350000, 4, "Automatic");

        Mobil mobil2 = new Mobil("M002", "Honda", 2022, 300000, 4, "Manual");

        Motor motor1 = new Motor("R001", "Yamaha", 2023, 100000, 155, "Sport");

        Motor motor2 = new Motor("R002", "Honda", 2021, 80000, 125, "Matic");

        mobil1.setHargaSewaPerHari(400000);

        System.out.println("=== DATA MOBIL1 ===");
        System.out.println("Kode : " + mobil1.getKodeKendaraan());
        System.out.println("Merk : " + mobil1.getMerk());
        System.out.println("Tahun : " + mobil1.getTahunProduksi());
        System.out.println("Harga : " + mobil1.getHargaSewaPerHari());
        System.out.println("Jumlah Pintu : " + mobil1.getJumlahPintu());
        System.out.println("Transmisi : " + mobil1.getJenisTransmisi());

        System.out.println();

        System.out.println("=== DATA MOBIL2 ===");
        System.err.println("Kode : " + mobil2.getKodeKendaraan());
        System.out.println("Merk : " + mobil2.getMerk());
        System.out.println("Tahun : " + mobil2.getTahunProduksi());
        System.err.println("Harga : " + mobil2.getHargaSewaPerHari());
        System.out.println("Jumlah Pintu : " + mobil2.getJumlahPintu());
        System.out.println("Transmisi : " + mobil2.getJenisTransmisi());

        System.out.println();

        System.out.println("=== DATA MOTOR1 ===");
        System.out.println("Kode : " + motor1.getKodeKendaraan());
        System.out.println("Merk : " + motor1.getMerk());
        System.out.println("Tahun : " + motor1.getTahunProduksi());
        System.out.println("Harga : " + motor1.getHargaSewaPerHari());
        System.out.println("CC : " + motor1.getKapasitasMesin());
        System.out.println("Tipe : " + motor1.getTipeMotor());

        System.out.println();

        System.out.println("=== DATA MOTOR2 ===");
        System.out.println("Kode : " + motor2.getKodeKendaraan());
        System.out.println("Merk : " + motor2.getMerk());
        System.out.println("Tahun : " + motor2.getTahunProduksi());
        System.out.println("Harga : " + motor2.getHargaSewaPerHari());
        System.out.println("CC : " + motor2.getKapasitasMesin());
        System.out.println("Tipe : " + motor2.getTipeMotor());
    }
}