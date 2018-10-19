package com.company.lions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordsCountTest {

  WordsCount wordsCount = new WordsCount();

  @Test
  void wordsCount1() {
    int lenght = 1;
    String words[] = {"a", "bb", "b", "ccc"};
    int expected = 2;
    int given = wordsCount.wordsCount(words, lenght);
    assertEquals(expected, given);
  }

  @Test
  void wordsCount2() {
    int lenght = 2;
    String words[] = {"a", "bb", "b", "ccc"};
    int expected = 1;
    int given = wordsCount.wordsCount(words, lenght);
    assertEquals(expected, given);
  }

  @Test
  void wordsCount3() {
    int lenght = 3;
    String words[] = {"a", "bb", "b", "ccc"};
    int expected = 1;
    int given = wordsCount.wordsCount(words, lenght);
    assertEquals(expected, given);
  }

  @Test
  void wordsCount222() {
    int lenght = 222;
    String words[] = {"a", "bb", "b", "ccc"};
    int expected = 0;
    int given = wordsCount.wordsCount(words, lenght);
    assertEquals(expected, given);
  }
}