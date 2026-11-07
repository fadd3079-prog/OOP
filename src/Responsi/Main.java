package Responsi;

public class Main{
    public static void main(String[] args) {
        // instansiasi melalui referensi Interface, bukan class langsung
        System.out.println("1. Uji Polimorfisme Interface");
        kontrolMesin trukDiesel = new trukKargo("HNR-0002", "Hino Ranger");
        trukDiesel.hidupkanMesin(true);
        System.out.println("Status mesin truk menyala? "+ trukDiesel.cekStatusMesin());
        System.out.println();

        // subclass mobil sport
        System.out.println("2. Uji enkapsulasi, super chaining, dan abstract");
        mobilSport lambo = new mobilSport("LBG-1010", "Lamborghini Aventador");

        // super chaining
        lambo.tampilkanInfo();  
        // multiple interface
        lambo.setTujuan("Sirkuit mandalika"); 
        System.out.println();

        System.out.println("3. Uji state percabangan");
        // state awal mesin mati
        
        // ubah state
        lambo.hidupkanMesin(true); 
        lambo.gasPol();
        lambo.gasPol();
        lambo.gasPol();
        lambo.gasPol();
        lambo.gasPol();
        lambo.gasPol();
    }
}