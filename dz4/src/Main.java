public class Main {
    public static void main(String[] args) {
        // Створюємо екземпляр Androids
        Androids androidPhone = new Androids();
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.runLinuxApps();
        System.out.println("-------------------------");
        // Створюємо екземпляр iPhones
        iPhones iPhone = new iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.runiOSApps();
    }
}
