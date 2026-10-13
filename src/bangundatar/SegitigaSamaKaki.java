package bangundatar;

public class SegitigaSamaKaki extends BangunDatar {

    private double alas;
    private double tinggi;
    private double sisiMiring;

    public SegitigaSamaKaki(double alas, double tinggi, double sisiMiring) {
        super("Segitiga Sama Kaki");
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        return alas + (2 * sisiMiring);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Alas        : " + alas);
        System.out.println("Tinggi      : " + tinggi);
        System.out.println("Sisi Miring : " + sisiMiring);
        System.out.println("Luas        : " + luas());
        System.out.println("Keliling    : " + keliling());
        System.out.println();
    }
}