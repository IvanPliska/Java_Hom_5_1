package ru.netology.sqr.Homework_5_1.calculation;

public class MainQA38 {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int dow = 200;
        int up = 300;
        System.out.println(service.calcService(dow, up));
    }
}
