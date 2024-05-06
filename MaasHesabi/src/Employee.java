public class Employee {

    String name; // Çalışanın ismini tutan değişken
    int salary; // Çalışanın maaşını tutan değişken
    int workHour; // Haftalık çalışma saatini tutan değişken
    int hireYear; // İşe başlama yılını tutan değişken

    // Constructor metodu, çalışanın bilgilerini alır ve nesneyi başlatır
    public Employee(String name, int salary, int workHour, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodunu gerçekleştirir
    public double tax() {
        if (salary < 1000 && salary > 0) { // Eğer maaş 1000'den az ve 0'dan büyükse vergi uygulanmaz
            return 0;
        } else { // Aksi durumda, maaşın %3'ü vergi olarak uygulanır
            return (salary * 0.03);
        }
    }

    // Bonus hesaplama metodunu gerçekleştirir
    public int bonus() {
        if (workHour > 40) { // Haftalık çalışma saati 40'tan fazlaysa, her fazladan çalışılan saat için 30 birim bonus verilir
            return ((workHour - 40) * 30);
        } else { // Aksi durumda bonus uygulanmaz
            return 0;
        }
    }

    // Maaş artışı hesaplama metodunu gerçekleştirir
    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear; // Şu ana kadar çalışılan yıl hesaplanır
        if (yearsWorked < 10) { // Eğer çalışan 10 yıldan az süredir çalışıyorsa, maaşına %5 oranında artış yapılır
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked <= 20) { // Eğer çalışan 10-20 yıl arasında çalışıyorsa, maaşına %10 oranında artış yapılır
            return salary * 0.10;
        } else { // Aksi durumda, maaşına %20 oranında artış yapılır
            return salary * 0.15;
        }
    }

    // Çalışanın bilgilerini ve hesaplanan maaşı içeren bir metin döndürür
    public String toString() {
        double totalSalary = salary - tax() + bonus(); // Vergi ve bonuslar düşülüp toplam maaş hesaplanır
        double raiseWithTotal = totalSalary + raiseSalary(); // Maaş artışı ile birlikte toplam maaş hesaplanır
        return "Adı: " + name + "\n" +
                "Maaşı: " + salary + "\n" +
                "Çalışma Saati: " + workHour + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Maaş Artışı: " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + totalSalary + "\n" +
                "Toplam Maaş: " + raiseWithTotal;
    }
}
