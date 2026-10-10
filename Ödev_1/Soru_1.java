/*
 * Ödev 1 - Soru 1
 * 1'den 50'ye kadar olan tek ve çift sayıların toplamını bulan program.
 *
 * Beklenen çıktı:
 *   1'den 50'ye kadar olan tek sayıların toplamı: 625
 *   1'den 50'ye kadar olan çift sayıların toplamı: 650
 */
public class Soru_1 {
    public static void main(String[] args) {
        // Toplamları tutacak değişkenler, başlangıçta 0
        int tekToplam = 0;
        int ciftToplam = 0;

        // 1'den 50'ye kadar (50 dahil) tüm sayıları tek tek dolaş
        for (int i = 1; i <= 50; i++) {
            // Sayının 2'ye bölümünden kalan 0 ise sayı çifttir
            if (i % 2 == 0) {
                ciftToplam += i; // çift sayıyı çift toplamına ekle
            } else {
                tekToplam += i;  // kalan 1 ise sayı tektir, tek toplamına ekle
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("1'den 50'ye kadar olan tek sayıların toplamı: " + tekToplam);
        System.out.println("1'den 50'ye kadar olan çift sayıların toplamı: " + ciftToplam);
    }
}
