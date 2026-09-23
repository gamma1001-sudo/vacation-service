package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int restMonths = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                restMonths++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return restMonths;
    }
}
