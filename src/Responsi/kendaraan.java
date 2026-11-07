package Responsi;

public abstract class kendaraan {
    // immunability (konstanta global)
    public static final int MAX_KECEPATAN=200;

    // immunability private final
    private final String nomorRangka;

    //  enkapsulasi
    private String merk;
    private int kecepatan;

    // overloading
    public kendaraan(String nomorRangka){
        this.nomorRangka=nomorRangka;
        this.merk="tanpa merk";
        this.kecepatan=0;
    }
    public kendaraan(String nomorRangka, String merk){
        this.nomorRangka=nomorRangka;
        this.merk=merk;
        this.kecepatan=0;
    }

    // abstract method
    public voig gasPol();
    
    public void tampilkanInfo(){
        System.out.println("Nomor rangka: "+this.nomorRangka);
    }
}
