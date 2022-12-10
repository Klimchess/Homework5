import java.time.Year;

public class Main {
    public static void main(String[] args) {
        // задача 1 и 2
        byte clientOS = 0;
        int clientDevaceYear = 2013;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
            if (clientDevaceYear < 2015) System.out.println("Установите облегченную версию для IOS по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите вверсию приложения для Android по ссылке");
            if (clientDevaceYear < 2015) System.out.println("Установите облегченную версию для Android по ссылке");
        }
        // задача 3
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        // задача 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {System.out.println( "Потребуется дней: 1");}
        else if (deliveryDistance > 20 && deliveryDistance <=60) {System.out.println( "Потребуется дней 2");}
        else if (deliveryDistance > 60 && deliveryDistance <=100) {System.out.println("Потребуется дней 3");}
        else if  (deliveryDistance > 100){System.out.println("Доставки нет");}
        // задача 5
        int monthNumber = 12;
        switch (monthNumber) {case 12: case 1: case 2: System.out.println( "Зима");
            break;
            case 3: case 4: case 5: System.out.println("Весна");
            break;
            case 6: case 7: case 8: System.out.println("Лето");
            break;
            case 9: case 10: case 11: System.out.println("Осень");
            break;
            default: System.out.println("Такого не существует");
        }


    }
}

