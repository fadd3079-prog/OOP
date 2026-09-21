package pertemuan5;

public class mobilTruck extends mobil{
    private int bakPasir;
    private int Gandengan;
    
    public mobilTruck (String Merek, int roda, int kursi, int transmisi, int bakPasir, int Gandengan){
        super(Merek, roda, kursi, transmisi);
        this.bakPasir=bakPasir;
        this.Gandengan=Gandengan;
    }

    public void tampilkanTruck(){
        System.out.println("mobil dengan merek:"+getMerek());
        System.out.println("jumlah roda:"+getRoda());
        System.out.println("transmisi:"+getTransmisi());
        System.out.println("dilengkapi dengan bak pasir:" +bakPasir);
        System.out.println("dilengkapi gandengan:" +Gandengan);
    }
}
