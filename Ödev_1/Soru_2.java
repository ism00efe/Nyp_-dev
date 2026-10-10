/*
 * Ödev 1 - Soru 2
 * 12345 sayısının içinde 7 rakamının olup olmadığını kontrol eden program.
 *
 * Yöntem: Sayının son basamağı % 10 ile alınır, / 10 ile o basamak atılır.
 * Bu işlem sayı 0 olana kadar tekrarlanır ve her basamak 7 ile karşılaştırılır.
 *
 * Beklenen çıktı:
 *   12345 sayısının içinde 7 rakamı YOK.
 */
public class Soru_2 {
    public static void main(String[] args) {
        int sayi = 12345;       // kontrol edilecek sayı
        int arananRakam = 7;    // aranan rakam
        boolean bulundu = false; // rakam bulunursa true olacak

        // Asıl sayıyı bozmamak için kopyası üzerinde çalışıyoruz
        int gecici = sayi;

        // Sayıda basamak kaldığı sürece devam et
        while (gecici > 0) {
            int sonBasamak = gecici % 10; // son basamağı al (ör. 12345 -> 5)

            // Son basamak aranan rakama eşitse bulundu, döngüden çık
            if (sonBasamak == arananRakam) {
                bulundu = true;
                break;
            }

            gecici = gecici / 10; // son basamağı at (ör. 12345 -> 1234)
        }

        // Sonuca göre mesaj yazdır
        if (bulundu) {
            System.out.println(sayi + " sayısının içinde " + arananRakam + " rakamı VAR.");
        } else {
            System.out.println(sayi + " sayısının içinde " + arananRakam + " rakamı YOK.");
        }
    }
}
