import java.util.Scanner;

//Bu methodun içinde kelimenin panlindromik olup olmadığını sorgulayacağız.
public class PalidromikKelimeler {

    static boolean isPalindrome(String inputWord) {
        int i = 0, j = inputWord.length() - 1; // kelimenin başından ve sonundan harkleri seçeceğiz
        while (i < j) {
            if (inputWord.charAt(i) != inputWord.charAt(j)) { // kelimenin harflerini charAt ile gezerek eşitlik sorguluyoruz
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan kelime alıyoruz
        System.out.print("Kontrol etmek istediğiniz kelimeyi yazınız: ");
        String inputWord = input.next();
        // kelimeyle methodu çağırıp duruma göre cevabı yazıdırıyoruz
        if (isPalindrome(inputWord)) {
            System.out.println(inputWord + " palindromiktir.");
        } else {
            System.out.println(inputWord + " palindromik değildir.");
        }
    }
}