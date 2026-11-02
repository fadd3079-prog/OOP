package Pertemuan6;

public class dasar {
    private int x;

    public dasar(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void tampilkanInformasi() {
        System.out.println("Method dari class induk");
        System.out.println("x=" + x);
    }
}
