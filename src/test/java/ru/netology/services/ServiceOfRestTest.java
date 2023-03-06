package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ServiceOfRestTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")

    public void testOne(int income, int expense, int threshold, int expected) {

        ServiceOfRest service = new ServiceOfRest();
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);

    }









}
