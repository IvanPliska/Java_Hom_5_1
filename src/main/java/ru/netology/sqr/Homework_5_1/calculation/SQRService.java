package ru.netology.sqr.Homework_5_1.calculation;

public class SQRService {

    public int calcService(int down, int upper) {

        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= down && i * i <= upper) {
                count++;
            }
        }
        return count;
    }
}
