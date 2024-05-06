public class Employee {
// Değişkenler
    String name;
    int salary;
    int workHour;
    int hireYear;

    // Constructor metodu, çalışanın bilgilerini alır ve nesneyi başlatır
    public Employee(String name, int salary, int workHour, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu
    public double tax() {
        if (salary < 1000 && salary > 0) { // Eğer maaş 1000'den az ve 0'dan büyükse vergi uygulanmaz
            return 0;
        } else { // Aksi durumda, maaşın %3'ü vergi olarak uygulanır
            return (salary * 0.03);
        }
    }

    // Bonus hesaplama methodu
    public int bonus() {
        if (workHour > 40) { // Haftalık çalışma saati 40'tan fazlaysa, hersaat için 30 lira bonus
            return ((workHour - 40) * 30);
        } else { // Aksi durumda bonus uygulanmaz
            return 0;
        }
    }

    // Maaş artışı hesaplama methodu
    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear; // Şu ana kadar çalışılan yıl hesaplanır
        if (yearsWorked < 10) { // Eğer çalışan 10 yıldan az süredir çalışıyorsa, maaşına %5 oranında artış yapılır
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked <= 20) { // Eğer çalışan 10-20 yıl arasında çalışıyorsa, maaşına %10 oranında artış yapılır
            return salary * 0.10;
        } else { // Aksi durumda, maaşına %15 oranında artış yapılır
            return salary * 0.15;
        }
    }

    // Çalışanın bilgilerini ve hesaplanan maaşı döndüren method
    public String toString() {
        double totalSalary = salary - tax() + bonus(); // Vergi ve bonuslar düşülüp toplam maaş
        double raiseWithTotal = totalSalary + raiseSalary(); // Maaş artışı ile birlikte toplam maaş
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
