package com.company.lions;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {

  public List wordsWithoutList(String[] words, int len) {
    List score = new ArrayList();
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() != len) {
        score.add(words[i]);
      }
    }
    return score;
  }
}