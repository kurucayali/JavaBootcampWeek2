public class HarmonicAvarageInArray {
    public static void main(String[] args) {
        int[] list = {8,2,3,4,5};
        double harmonic = 0;
        for (int i = 0; i < list.length; i++) {
            harmonic += 1.0/ list[i];
        }
        double harmonicAvarage =list.length/harmonic;
        System.out.print(harmonicAvarage);

    }
}
