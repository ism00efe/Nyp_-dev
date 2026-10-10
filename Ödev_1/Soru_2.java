// Soru 2: 12345 sayısının içinde 7 rakamının olup olmadığını kontrol eden program

public class Soru_2 {
    public static void main(String[] args) {
        int sayi = 12345;
        int arananRakam = 7;
        boolean bulundu = false;

        int gecici = sayi;
        while (gecici > 0) {
            int sonBasamak = gecici % 10; // sayının son basamağını al
            if (sonBasamak == arananRakam) {
                bulundu = true;
                break;
            }
            gecici = gecici / 10; // son basamağı at
        }

        if (bulundu) {
            System.out.println(sayi + " sayısının içinde " + arananRakam + " rakamı VAR.");
        } else {
            System.out.println(sayi + " sayısının içinde " + arananRakam + " rakamı YOK.");
        }
    }
}
