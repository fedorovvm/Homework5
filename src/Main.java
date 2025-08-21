
public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        //Задание 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        //Задание 3
        int year = 2021;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else if (year > 1584 && year % 4 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        //Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            int day = 1;
            System.out.println("Потребуется дней " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            int day = 2;
            System.out.println("Потребуется дней " + day);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            int day = 3;
            System.out.println("Потребуется дней " + day);
        } else {
            System.out.println("Доставки нет.");
        }
        //Задание 5
        int monthNumber = 12;
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Ошибка, выберите номер месяца от 1 до 12");
        } else {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зимний месяц.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весенний месяц.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Летний месяц.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осенний месяц.");
                    break;
            }
        }
    }
}