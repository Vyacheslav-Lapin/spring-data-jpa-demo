package ru.vlapin.experiments.springdatajpademo;

import static java.util.Map.entry;

import java.util.Date;
import java.util.Map;
import lombok.SneakyThrows;
import lombok.val;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

  public static void main(String[] args) {
    m0();
    SpringApplication.run(SpringDataJpaDemoApplication.class, args);
  }

  @SneakyThrows
  public static @NotNull Map<String, Date> m0() {
    //    return Map.of("kjhdfg", new Date(), "kjhdfufd", new Date());

    val stringDateMap = Map.ofEntries(
        entry("kjhdfg", new Date()),
        entry("kjhdfufd", new Date()));

    var d = new Date() {
      public String m0() {
        return "123";
      }
    };

    System.out.println("d.m0() = " + d.m0());

    val f = switch (d.m0()) {
      case "123" -> "456";
      case "124" -> "456";
      case "125" -> "456";
      case "126" -> "456";
      case "127" -> "456";
      default -> throw new IllegalStateException("Unexpected value: " + d.m0());
    };

    return stringDateMap;
  }
}
