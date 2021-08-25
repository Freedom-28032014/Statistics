package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {


    @Test
    void shouldSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        int actual = service.sum(purchases);
        int expected = 180;
        assertEquals(expected, actual, "Test sum method");
    }

    @Test
    void shouldAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        int actual = service.sum(purchases);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthNumberWithMax() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        int actual = service.monthWithMax(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthNumberWithMin() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        int actual = service.monthWithMin(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMoreThanAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        int actual = service.monthsWithMoreThanAvg(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithLessThanAvg() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        int actual = service.monthsWithMoreThanAvg(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
