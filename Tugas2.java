import java.util.Scanner;

public class Tugas2 {

    public static void bentukPersegi(Scanner input) {
        System.out.println("Masukkanlah panjang sisinya : ");
        double sisi = input.nextDouble();

        double luas = menghitungLuasPersegi(sisi);
        double keliling = menghitungKelilingPersegi(sisi);

        System.out.println("Luas Perseginya : " + luas);
        System.out.println("Luas Kelilingnya : " + keliling);
    }
    public static double menghitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }
    public static double menghitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    public static void bentukPersegiPanjang(Scanner input) {
        System.out.println("Masukkanlah panjangnya : ");
        double panjang = input.nextDouble();
        System.out.println("Masukkanlah lebarnya : ");
        double lebar = input.nextDouble();

        double luas = menghitungLuasPersegiPanjang(panjang, lebar);
        double keliling = menghitungKelilingPersegiPanjang(panjang, lebar);

        System.out.println("Luas Persegi Panjang : " + luas);
        System.out.println("Keliling Persegi Panjang : " + keliling);
    }
    public static double menghitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    public static double menghitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static void bentukLingkaran(Scanner input) {
        System.out.println("Masukkan jari-jarinya : ");
        double jariJari = input.nextDouble();

        double luas = menghitungLuasLingkaran(jariJari);
        double keliling = menghitungKelilingLingkaran(jariJari);

        System.out.println("Luas Lingkarannya : " + luas);
        System.out.println("Keliling Lingkarannya : " + keliling);
    }
    public static double menghitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
    public static double menghitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihlah bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("Masukkan pilihanmu: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                bentukPersegi(input);
                break;
            case 2:
                bentukPersegiPanjang(input);
                break;
            case 3:
                bentukLingkaran(input);
                break;
            default:
                System.out.println("Pilih dari angka 1/2/3");
        }
    }
}
