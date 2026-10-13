package bangundatar;

public class Main {

    public static void main(String[] args) {

        SegitigaSamaKaki segitiga =
                new SegitigaSamaKaki(10, 8, 9);

        PersegiPanjang persegiPanjang =
                new PersegiPanjang(12, 6);

        Lingkaran lingkaran =
                new Lingkaran(7);

        segitiga.tampilkanInfo();
        persegiPanjang.tampilkanInfo();
        lingkaran.tampilkanInfo();
    }
}