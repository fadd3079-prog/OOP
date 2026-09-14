package pertemuan3;


public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();
        mhs.setAlamat("Purbalingga");
        System.out.println("Alamat awal: " + mhs.getAlamat());

        mhs.setAlamat("jakarta selatan");
        System.out.println("alamat baru: " + mhs.getAlamat());

    }

}
