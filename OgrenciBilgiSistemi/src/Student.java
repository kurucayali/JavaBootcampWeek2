public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat1,int mat2, int fizik1, int fizik2, int kimya1, int kimya2) {

        if (mat1 >= 0 && mat1 <= 100 && mat2 >= 0 && mat2 <= 100) {
            int mat = (int) ((mat1*0.20)+(mat2*0.80));
            this.mat.note = mat;

        }

        if (fizik1 >= 0 && fizik1 <= 100 && fizik2 >= 0 && fizik2 <= 100) {
            double fizik = (int)(fizik1*0.20)+(fizik2*0.80);
            this.fizik.note = (int) fizik;
        }

        if (kimya1 >= 0 && kimya1 <= 100 && kimya2 >= 0 && kimya2 <= 100) {
            double kimya = (int) (kimya1*0.20)+(kimya2*0.80);
            this.kimya.note = (int) kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (double) (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}