import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        int year = 2022;
        ProverkaGoda(year);
        int clientOS = 0;
        ProverkaOS(clientOS);
        int deliveryDistance = 95;
        DostavkaKartiDnei(deliveryDistance);



    }

    public static int ProverkaGoda(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " являеется високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
        return year;
    }

    public static int ProverkaOS(int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (currentYear >= 2015) {
                System.out.println("Установите современну версию приложения для iOS по ссылке");
                return 0;
            } else {
                System.out.println("Установите lite версию приложения для iOS по ссылке");
                return 1;
            }
        } else {
            if (clientOS >= currentYear) {
                System.out.println("Установите современну версию приложения для Android по ссылке");
                return 0;
            } else {
                System.out.println("Установите lite версию приложения для Android по ссылке");
                return 1;
            }
        }

    }

    public  static int DostavkaKartiDnei(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20){
            deliveryDays++;
        }
        if (deliveryDistance > 60){
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);
        return deliveryDays;

    }
}