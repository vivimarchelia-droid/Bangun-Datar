package bangundatar;

public class Lingkaran extends BangunDatar {

    private double jariJari;

    public Lingkaran(double jariJari) {
        super("Lingkaran");
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Jari-jari   : " + jariJari);
        System.out.println("Luas        : " + luas());
        System.out.println("Keliling    : " + keliling());
        System.out.println();
    }
}