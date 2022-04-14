package ru.skypro;

public class Main {

    public static void main(String[] args) {
	//Task 1.
        System.out.println(" Задача 1. Ответ.");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName ;
        System.out.println("ФИО сотрудника - " + fullName);

    //Task 2.
        System.out.println("_________________");
        System.out.println(" Задача 2. Ответ.");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println(" Данные ФИО сотрудника для заполнения отчёта - " + fullNameUpper);

    // Task 3.
        System.out.println("_________________");
        System.out.println(" Задача 3. Ответ.");
        // строка fullName  имеет присвоенное значение выше. Ниже замена на Семёна...
        // и далее удаление ё. при изменении вводных данных для формирования fullName,
        // СемЕн останется неизменен :)))
        String fullName2 = fullName.replaceAll(fullName, "Иванов Семён Семёнович");
        String fullNameBase = fullName2.replace('ё', 'е');
        System.out.println(" Данные ФИО сотрудника - " + fullNameBase);





    }
}
