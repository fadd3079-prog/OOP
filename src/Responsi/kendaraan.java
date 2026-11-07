package Responsi;

public abstract class kendaraan {
    // immunability (konstanta global)
    public static final int MAX_KECEPATAN=500;

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
    public abstract void gasPol();
    
    public void tampilkanInfo(){
        System.out.println("Nomor rangka: "+this.nomorRangka);
        System.out.println("Merk: "+this.merk);
    }

    // getter setter
    public String getNomorRangka(){
        return nomorRangka;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public int getKecepatan(){
        return kecepatan;
    }
    public void setKecepatan(int kecepaatanBaru){
        if(kecepaatanBaru>kendaraan.MAX_KECEPATAN){
            this.kecepatan=kendaraan.MAX_KECEPATAN;
        }else if(kecepaatanBaru<0){
            this.kecepatan=0;
        }else{
            this.kecepatan=kecepaatanBaru;
        }
    }
}
