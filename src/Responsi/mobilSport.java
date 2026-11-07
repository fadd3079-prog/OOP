package Responsi;

public class mobilSport extends kendaraan implements kontrolMesin,navigasi{
    private boolean mesinHidup;
    private String tujuan;
    public mobilSport(String nomorRangka, String merk){
        // super chaining konstruktor
        super(nomorRangka, merk);
        this.mesinHidup=false;
        this.tujuan="Belum diatur";
    }

    // interface kontolMesin
    @Override
    public void hidupkanMesin(boolean status){
        this.mesinHidup=status;
        System.out.println("Mesin "+ getMerk()+(status ? " dihidupkan" : " dimatikan"));
    }
    @Override
    public boolean cekStatusMesin(){
        return this.mesinHidup;
    }

    // interfaec navigasi
    @Override
    public void setTujuan(String lokasi){
        this.tujuan=lokasi;
        System.out.println("GPS diatur menuju: " + lokasi);

    }
    @Override
    public String getTujuan(){
        return this.tujuan;
    }

@Override
    public void gasPol() {
        if(this.mesinHidup){
            setKecepatan(getKecepatan()+100);
            System.out.println(getMerk()+ " melaju dengan kecepatan "+getKecepatan());
        }else{
            System.out.println("Mesin "+getMerk()+" belum dinyalakan");
        }
    }

    // super chaining pemanggilan method induk
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo(); // memanggil method tampikanInfo() class kendaraan
        System.out.println("Tipe kategori: Mobil sport balap");
        System.out.println("Tujuan GPS: "+this.tujuan);
    }

}
