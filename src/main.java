package geometri;
public class main {
     public static void main(String[] args) {
        double radiusLingkaran = 9.8;
        Lingkaran lingkaran = new Lingkaran(radiusLingkaran);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        double panjangPersegiPanjang = 4.0;
        double lebarPersegiPanjang = 6.0;
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
    }
}
