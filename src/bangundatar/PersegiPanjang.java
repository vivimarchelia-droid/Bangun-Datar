package bangundatar;

public class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Panjang     : " + panjang);
        System.out.println("Lebar       : " + lebar);
        System.out.println("Luas        : " + luas());
        System.out.println("Keliling    : " + keliling());
        System.out.println();
    }
}