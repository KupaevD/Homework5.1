package ru.netology.services;
public class ServiceOfRest {
    public int calculate ( int income, int expense, int threshold ){
        int money = 0;
        int count = 0;

        for (int month = 0; month < 12; month++) {

            if (money < threshold) {
                money = money + income - expense;
            } else {
                money = money - threshold;
                count++;
            }
        }


        return count;
    }



}
