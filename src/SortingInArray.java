// Kullanıcıdan ilk olaran kaç elemanlı bir dizi oluşturmak istediğini alacağız.
// eleman sayısı kadar diziye girdi yapacak.
// dizinin elamanları büyükten küçüğe sıralanarak ekrana basılacak

import java.util.Arrays; // sort mwthodu için import edildi.
import java.util.Scanner;

public class SortingInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ".Elamanı: ");
            list[i] = input.nextInt();
        }
        //Diziyi küçükten büyüğe sıralama
        Arrays.sort(list);

        // Sıralanmış diziyi ekran basalım
        System.out.print("Sıralama: ");
        for (int eleman : list) {
            System.out.print(eleman + " ");
        }
    }
}

