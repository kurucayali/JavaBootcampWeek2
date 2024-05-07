public class CiftTekrarEdenSayilarListedeBul {
    public static void main(String[] args) {
        int[] list = {1, 2, 5, 2, 5, 6, 7, 8, 2,2, 8, 9, 9, 11, 15};
        int[] list2 = new int[list.length]; // Tekrar eden ve çift olanların saklanacağı dizi
        int[] list3 = new int[list.length];
        int index = 0;

        // Tekrar eden çift sayıları bul
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j] && list[i] % 2 == 0) {
                    list2[index++] = list[i];
                    System.out.print(list[i] + "  ");
                    break;
                }
            }
        }
        System.out.println(" ");

        // Tekrar eden çift sayıları tekrar etmeyen şekilde list3 dizisine atama
        for (int i = 0; i < index; i++) {
            boolean repeat = false;
            for (int j = 0; j < i; j++) {
                if (list2[i] == list2[j]) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                list3[i] = list2[i];
                System.out.print(list2[i] + "  ");
            }
        }
    }
}
