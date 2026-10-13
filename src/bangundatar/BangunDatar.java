package bangundatar;

public class BangunDatar {

    protected String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    public double luas() {
        return 0;
    }

    public double keliling() {
        return 0;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Bangun : " + nama);
        System.out.println("Luas        : " + luas());
        System.out.println("Keliling    : " + keliling());
    }
}