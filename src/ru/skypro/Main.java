package ru.skypro;

public class Main {

    public static void main(String[] args) {
	//Task 1.
        System.out.println(" ������ 1. �����.");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName ;
        System.out.println("��� ���������� - " + fullName);

    //Task 2.
        System.out.println("_________________");
        System.out.println(" ������ 2. �����.");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println(" ������ ��� ���������� ��� ���������� ������ - " + fullNameUpper);

    // Task 3.
        System.out.println("_________________");
        System.out.println(" ������ 3. �����.");
        // ������ fullName  ����� ����������� �������� ����. ���� ������ �� �����...
        // � ����� �������� �. ��� ��������� ������� ������ ��� ������������ fullName,
        // ����� ��������� ��������� :)))
        String fullName2 = fullName.replaceAll(fullName, "������ ���� ��������");
        String fullNameBase = fullName2.replace('�', '�');
        System.out.println(" ������ ��� ���������� - " + fullNameBase);





    }
}
