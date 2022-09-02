package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainIfAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 500;

        int actual = service.remain(500);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;

        int actual = service.remain(1200);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfAmountEqually1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;

        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }
}