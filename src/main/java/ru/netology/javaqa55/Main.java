package ru.netology.javaqa55;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 51000;
        boolean registered = false;
        // long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        System.out.println(actual);
    }
}