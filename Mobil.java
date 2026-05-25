public class Mobil extends Kendaraan {
    
    private int jumlahPintu;
    private String jenisTransmisi;

    public Mobil(String kodeKendaraan, String merk, int tahunProduksi, double hargaSewaPerHari, int jumlahPintu, String jenisTransmisi) {

        super(kodeKendaraan, merk, tahunProduksi, hargaSewaPerHari);

        this.jumlahPintu = jumlahPintu;
        this.jenisTransmisi = jenisTransmisi;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getJenisTransmisi() {
        return jenisTransmisi;
    }

    public void setJenisTransmisi(String jenisTransmisi) {
        this.jenisTransmisi = jenisTransmisi;
    }
}