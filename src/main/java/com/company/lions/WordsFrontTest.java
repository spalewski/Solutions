package com.company.lions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordsFrontTest {

  WordsFront wordsFront = new WordsFront();

  @Test
  void testWordsFront() {
    int range = 3;
    String array[] = {"a", "b", "c", "d"};
    String expected[] = {"a", "b", "c"};
    String given[] = wordsFront.wordsFront(array, range);
    assertArrayEquals(expected, given);
  }
}