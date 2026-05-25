public class Motor extends Kendaraan {
    
    private int kapasitasMesin;
    private String tipeMotor;

    public Motor(String kodeKendaraan, String merk, int tahunProduksi, double hargaSewaPerHari, int kapasitasMesin, String tipeMotor) {

        super(kodeKendaraan, merk, tahunProduksi, hargaSewaPerHari);

        this.kapasitasMesin = kapasitasMesin;
        this.tipeMotor = tipeMotor;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public String getTipeMotor() {
        return tipeMotor;
    }

    public void setTipeMotor(String tipeMotor) {
        this.tipeMotor = tipeMotor;
    }
}