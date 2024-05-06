public class Main {
    public static void main(String[] args) {
        // Kemal adında bir Employee nesnesi oluşturuluyor ve parametreler veriliyor: isim, maaş, çalışma saati, başlangıç yılı
        Employee Kemal = new Employee("Kemal", 2000, 45, 1985);
        // Kemal'in bilgileri yazdırılıyor
        System.out.println(Kemal.toString()); // toString metodu çağrıldığında sonucun yazdırılması
    }
}
