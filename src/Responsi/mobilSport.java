package Responsi;

public class mobilSport extends kendaraan implements kontrolMesin,navigasi{
    private boolean mesinHdup;
    private String tujuan;
    public mobilSport(String nomorRangka, String merk){
        // super chaining konstruktor
        super(nomorRangka, merk);
        this.mesinHdup=false;
        this.tujuan="Belum diatur";
    }

    // interface kontolMesin
    @Override
    public void hidupkanMesin(boolean status){
        this.mesinHdup=status;
        System.out.println("Mesin "+ getMerk()+(status ? " DIHIDUPKAN." : " DIMATIKAN."));
    }
    @Override
    public boolean cekStatusMesin(){
        return this.mesinHdup;
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
    public void gasPol(){
        // percabangan is else
        if(this.mesinHdup){
            if(getKecepatan() + 50<= kendaraan.MAX_KECEPATAN){
                setKecepatan(getKecepatan()+50);
                System.out.println(getMerk()+"Melaju cepat, kecepatan "+getKecepatan()+" km/jam");
            }else{
                setKecepatan(kendaraan.MAX_KECEPATAN);
                System.out.println(getMerk()+" mencapai kecepatan penuh " +kendaraan.MAX_KECEPATAN + " km/jam");
            }
        }else{
                System.out.println("Mesin " +getMerk()+ " belum dihidupkan");
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
