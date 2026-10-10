// Soru 1: 1'den 50'ye kadar olan tek ve çift sayıların toplamını bulan program

public class Soru_1 {
    public static void main(String[] args) {
        int tekToplam = 0;
        int ciftToplam = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                ciftToplam += i;
            } else {
                tekToplam += i;
            }
        }

        System.out.println("1'den 50'ye kadar olan tek sayıların toplamı: " + tekToplam);
        System.out.println("1'den 50'ye kadar olan çift sayıların toplamı: " + ciftToplam);
    }
}
