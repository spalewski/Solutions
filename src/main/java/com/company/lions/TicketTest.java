package com.company.lions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicketTest {

  Ticket ticket = new Ticket();

  @Test
  void testGreenTicketIfAllTheSame() {
    int a = 4;
    int b = 4;
    int c = 4;
    int expected = 20;
    int given = ticket.greenTicket(a, b, c);
    assertEquals(expected, given);
  }

  @Test
  void testGreenTicketIfTwoTheSame() {
    int a = 24;
    int b = 24;
    int c = 4;
    int expected = 10;
    int given = ticket.greenTicket(a, b, c);
    assertEquals(expected, given);
  }

  @Test
  void testGreenTicketIfAllDifferent() {
    int a = 24;
    int b = -6;
    int c = 2334;
    int expected = 0;
    int given = ticket.greenTicket(a, b, c);
    assertEquals(expected, given);
  }
}