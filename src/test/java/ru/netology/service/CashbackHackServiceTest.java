package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateRemain500() {
        int actual = service.remain(500);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemain999() {
        int actual = service.remain(999);
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldCalculateRemain1001() {
        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldCalculateRemain1000() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldCalculateRemain0() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldCalculateRemainMinus100() {
        int actual = service.remain(-100);
        int expected = 1100;

        assertEquals(expected, actual);
    }

}