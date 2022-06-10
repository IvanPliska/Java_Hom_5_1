package ru.netology.sqr.Homework_5_1.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServicetest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRServ.csv") // в файле SQRerv.csv подобраны значения для тестирования программы

    public void testSQRServiceDownUpper(int result, int down, int upper) {
        SQRService service = new SQRService();
        int count = service.calcService(down, upper);
        Assertions.assertEquals(result, count);
    }
}
