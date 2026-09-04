package test2;

class mahasiswa{
    String nama;
    String NIM;
    String jurusan;
}

public class Main {
    public static void main(String[] args) throws Exception{


        mahasiswa mhs1 = new mahasiswa();
        mhs1.nama = "Mufaddhol";
        mhs1.NIM = "H101010101";
        mhs1.jurusan = "S1 - Informatika";

        System.out.println("Nama: " +mhs1.nama);
        System.out.println("NIM: " +mhs1.NIM);
        System.out.println("Jurusan: " +mhs1.jurusan);
        
    }
}
