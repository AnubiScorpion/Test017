package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemainForAmountUnderBoundary() {
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateRemainForAmountZero() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainForBoundaryAmount() {
        int actual = service.remain(1000);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainForAmountOverBoundary() {
        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(actual, expected);
    }
}

