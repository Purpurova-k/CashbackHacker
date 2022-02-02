package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemain500() {
        int actual = service.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemain999() {
        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldCalculateRemain1001() {
        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldCalculateRemain1000() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldCalculateRemain0() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldCalculateRemainMinus100() {
        int actual = service.remain(-100);
        int expected = 1100;

        assertEquals(actual, expected);
    }

}