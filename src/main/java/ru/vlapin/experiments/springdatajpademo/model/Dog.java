package ru.vlapin.experiments.springdatajpademo.model;

import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;

@Data
@Slf4j
@Validated
@RequiredArgsConstructor//(staticName = "Dog")
sealed public class Dog {

  @Size(max = 10)
  @NonNull String name;
}

final class Kolly extends Dog {

  public Kolly(@Size(max = 10) @NonNull String name) {
    super(name);
  }
}
