package com.company.Avid;

class Ab {

  protected void meth1() {
    System.out.print("base version");
  }
}

class Cd extends Ab {

  final void meth1(int i) {
    System.out.print("int version");
  }

  void meth1(double d) {
    System.out.print("double version");
  }

  void meth1(char c) {
    System.out.print("char version");
  }
}


class Sup {

  protected void print() {
    System.out.print("A ");
  }
}

class Sub extends Sup {

  public void print() {
    System.out.print("B ");
  }

  void print(String s) {
    System.out.print(s);
  }
}

class A implements Runnable {

  public void run() {
    try {
      for (String x : new String[]{"On your mark ", "Get set "}) {
        System.out.print(x);
        Thread.currentThread().sleep(1000);
      }
    } catch (InterruptedException e) {
    }
    System.out.print("Go");
  }
}

class Person {

  public static void main(String[] args) {

    int[] k = {1, 2, 3};
    for (int l = 0; ++l < k.length; l++) {
      System.out.print(k[l]);
    }

    Cd ab = new Cd();
    ab.meth1(5);

    int x = 5, y = 10;
    try {
      y /= x;
    } catch (Exception e) {
      System.out.print("error");
    } finally {
      System.out.print("finally");
    }

    new Sub().print("C");

    int[] a = {1, 2, 3, 4, 5, 6};
    int i = a.length - 1;
    while (i >= 0) {
      System.out.print(a[i]);
      i--;
    }

    A f = new A();
    Thread t = new Thread(f);
    t.start();

    int[] u = {1, 2, 3, 4, 5, 6};
    int p = u.length - 1;
    while (p >= 0) {
      if (p % 2 == 0) {
        System.out.print(u[p]);
        i--;
      }
    }
  }
}