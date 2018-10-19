package com.company.lions;

public class Ticket {

  public int greenTicket(int a, int b, int c) {
    int result = 0;
    if (a == b && b == c) {
      result = 20;
    } else if (a == b || a == c || c == b) {
      result = 10;
    } else {
      result = 0;
    }
    return result;
  }
}