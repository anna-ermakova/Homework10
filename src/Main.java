import java.time.LocalDate;

public class Main {

    public static void checkingForLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный.");
            return;
        } else {
            System.out.println(year + " год не високосный.");
        }
    }

    public static void installTheVersionForOS(int clientOSis, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOSis == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOSis == 0 && clientDeviceYear < currentYear) {
            if (clientOSis == 0 && clientDeviceYear < currentYear)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOSis == 1 && clientDeviceYear < currentYear) {
            if (clientOSis == 1 && clientDeviceYear < currentYear)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (clientOSis == 1 && clientDeviceYear >= currentYear) {
            if (clientOSis == 1 && clientDeviceYear >= currentYear)
                System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void countTheDeliveryDays(int deliveryDistance) {
        int minDistance = 20; //км. Мин расстояние для доставки в 1 день
        int deltaDistance = 40;//km шаг расстояния для увеличения срока доставки
        int minDeliveryInDays = 1;// мин дней на доставку
        int deltaDeliveryInDays = 1;// дней. Шаг увеличения дней доставки
        if (deliveryDistance > deltaDistance) {
            System.out.println("На доставку потребуется дней: " + (minDeliveryInDays + (deltaDeliveryInDays * (deliveryDistance / deltaDistance))));
        } else if (deliveryDistance <= deltaDistance && deliveryDistance > minDistance) {
            System.out.println("На доставку потребуется дней: " + (minDeliveryInDays + deltaDeliveryInDays));}
        if (deliveryDistance <= minDistance) {
                System.out.println("На доставку потребуется дней: " + minDeliveryInDays);
            }
        }


    public static void main(String[] args) {

        //task 1

        System.out.println("Задание 1.");
        /*Задание 1
        Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным,
        и выводит результат в консоль.
        *Эту проверку вы уже реализовывали в задании по условным операторам.*
        Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
        Результат программы выведите в консоль. Если год високосный, то должно быть выведено “*номер года —* високосный год”.
        Если год не високосный, то, соответственно: “*номер года —* не **високосный год”.*/


        checkingForLeapYear(2020);// медод для проверки года на високосность

        //task 2

        System.out.println();
        System.out.println("Задание 2.");

        /* Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android) и год выпуска устройства.
        Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
        Текущий год можно получить таким способом:
        int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную, введя в переменную числовое значение.
        В результате программа должна выводить в консоль в зависимости от исходных данных, какую версию приложения
        (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю. */


        int clientOSis = 1;// IOS-0, Android-1
        int clientDeviceYear = 2022; // год выпуска
        installTheVersionForOS(clientOSis, clientDeviceYear);


        //task 3

        System.out.println();
        System.out.println("Задание 3.");

        /*Правила доставки такие:
    Доставка в пределах 20 км занимает сутки.
    Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
    Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
    То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
    Напишите программу, которая выдает сообщение в консоль:
    "Потребуется дней: " + срок доставки
    Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
    Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает
    итоговое количество дней доставки.
         */
        int deliveryDistance =95;
        countTheDeliveryDays(deliveryDistance);

    }
}

