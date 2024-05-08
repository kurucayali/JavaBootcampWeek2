// matris transpozunu alan program

import java.util.Arrays;

public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] list1 = {{1, 2, 3}, {4, 5, 6}};

        // list1 matrisini ekrana yazdıralım
        for (int i = 0; i < list1.length; i++) {
            System.out.println(Arrays.toString(list1[i]));
        }

        // Transpozu almak için list2 matrisini oluşturalım
        int[][] list2 = new int[list1[0].length][list1.length];

        // Matris transpozunu almak için i ve j nin yerlerini değiştiriyorum.
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[0].length; j++) {
                list2[j][i] = list1[i][j];
            }
        }

        // list2 matrisini ekrana yazdır
        for (int i = 0; i < list2.length; i++) {
            System.out.println(Arrays.toString(list2[i]));
        }
    }
}
