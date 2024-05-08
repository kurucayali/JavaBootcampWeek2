// bir dizi içerisindeki elemanların tekrar sayısını buluyoruz

import java.util.Arrays;

public class DizidekiFrekans {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] repeats = new int[list.length];

        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            int repeatN = 0; // Her elemanın tekrar sayısını sıfırdan başlat
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    repeatN++; // Tekrar sayısını artır
                }
            }
            repeats[i] = repeatN; // Tekrar sayısını diziye kaydet.Buradan çıktı alırken kullanacağız.
        }
        // sayıları teker teker kontrol ettiğimiz için 2 ve daha fazla sayı için fazladan kayıtlar oluşturduk.
        // burda tekrar edenleri bulacağız ve ekrana bastırmayacağız.
        for (int i = 0; i < list.length; i++) {
            boolean isCounted = false;
            for (int j = 0; j < i; j++) { // j den i ye kadar kontrolun sebebi tekrarı kontrol etmek.
                if (list[i] == list[j]) {
                    isCounted = true;
                    break;
                }
            } // ekrana bastıralım. tekrar eden kayıtlar hariç
            if (!isCounted) {
                System.out.println(list[i] + " den " + repeats[i] + " adet");
            }
        }
    }
}
