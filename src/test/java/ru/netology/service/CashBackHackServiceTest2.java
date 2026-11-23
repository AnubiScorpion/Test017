package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashBackHackServiceTest2 {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemainForAmountUnderBoundary() {
    int actual = service.remain(900);
    int expected = 100;

    assertEquals(expected, actual);
}

    @Test
    public void shouldCalculateRemainForAmountZero() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainForBoundaryAmount() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainForAmountOverBoundary() {
        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(expected, actual);
    }
}
