import java.util.Scanner;

public class PalidromikKelimeler {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz kelimeyi yazınız: ");
        String inputWord = input.next();

        if (isPalindrome(inputWord)) {
            System.out.println(inputWord + " palindromiktir.");
        } else {
            System.out.println(inputWord + " palindromik değildir.");
        }
    }
}