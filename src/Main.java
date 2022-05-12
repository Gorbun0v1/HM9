import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        int year = 2022;
        reviewCode(year);
        int clientOS = 0;
        reviewOS(clientOS);
        int deliveryDistance = 95;
        System.out.println("Потребуется дней " + deliverCard(deliveryDistance));



    }

    private static void reviewCode(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " являеется високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    private static void reviewOS(int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (currentYear >= 2015) {
                System.out.println("Установите современну версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите lite версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS >= currentYear) {
                System.out.println("Установите современну версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите lite версию приложения для Android по ссылке");
            }
        }

    }

    private static int deliverCard(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20){
            deliveryDays++;
        }
        if (deliveryDistance > 60){
            deliveryDays++;
        }
        return deliveryDays;

    }
}