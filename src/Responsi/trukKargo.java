package Responsi;

public class trukKargo extends kendaraan implements kontrolMesin {
    private boolean mesinHdup;
    public trukKargo(String nomorRangka, merk){
        super(nomorRangka, merk);
        this.mesinHdup=false;
    }
    
}
