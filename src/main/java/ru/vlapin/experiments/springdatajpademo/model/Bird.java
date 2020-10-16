package ru.vlapin.experiments.springdatajpademo.model;

import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;

public record Bird(String s, int age) {

  public static void main(String[] args) {
    Bird bird = new Bird("kjhgsdfg", 3);
    System.out.println("bird = " + bird);

    CharSequence charSequence = string1();
    if (charSequence instanceof String s) {
//      String s = (String) charSequence;
      s.length();
    }
  }

  @SneakyThrows
  public static @NotNull CharSequence string1() {
    return "kjhdfgkjhdfg";
  }


}
