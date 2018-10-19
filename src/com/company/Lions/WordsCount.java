package com.company.Lions;

public class WordsCount {

  public int wordsCount(String[] words, int len) {

    int score = 0;
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() == len) {
        score++;
      }
    }
    return score;
  }
}