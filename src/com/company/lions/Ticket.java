package com.company.lions;

public class Ticket {

  public int greenTicket(int a, int b, int c) {
    int resul = 0;
    if (a == b && b == c) {
      resul = 20;
    } else if (a == b || a == c || c == b) {
      resul = 10;
    } else {
      resul = 0;
    }
    return resul;
  }
}