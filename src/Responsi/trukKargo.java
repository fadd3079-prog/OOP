package Responsi;

public class trukKargo extends kendaraan implements kontrolMesin {
    private boolean mesinHidup;
    public trukKargo(String nomorRangka, String merk){
        super(nomorRangka, merk);
        this.mesinHidup=false;
    }
    @Override
    public void hidupkanMesin(boolean status) {
        this.mesinHidup=status;
        System.out.println("Mesin "+getMerk()+(status? " menyala" : " mati"));
    }

    @Override
    public boolean cekStatusMesin(){
        return this.mesinHidup;
    }
    @Override
    public void gasPol(){
        if(this.mesinHidup){
            setKecepatan(getKecepatan()+15);
            System.out.println(getMerk()+" melaju pelan karena muatan berat, kecepatan" +getKecepatan()+" km/jam");

        }else{
            System.out.println(getMerk() +" mesin belum dihidupkan");
        }
    }
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tipe kategori: Truk ekspedisi jarak jauh");
    }
}
