package ru.vlapin.experiments.springdatajpademo.controller.jsonplaceholder;

import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vlapin.experiments.springdatajpademo.model.Dog;

@Slf4j
@RestController
@RequestMapping("dog")
@RequiredArgsConstructor
public class DogController {

  @NotNull
  @GetMapping("all")
  @Contract(pure = true)
  public List<Dog> getDogs() {
    return List.of(new Dog("Жучка"), new Dog("Бобик"));
  }

  @PostMapping("save")
  Dog dog(@Valid @RequestBody Dog dog) {
    return dog; //todo 16.10.2020: сделать нормально
  }
}
