package com.company.Lions;

public class WordsFont {

  public String[] wordsFront(String[] words, int n) {

    String fonts[] = new String[n];
    for (int i = 0; i < n; i++) {
      fonts[i] = words[i];
    }
    return fonts;
  }
}