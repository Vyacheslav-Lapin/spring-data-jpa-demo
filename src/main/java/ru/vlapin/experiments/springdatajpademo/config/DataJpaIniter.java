package ru.vlapin.experiments.springdatajpademo.config;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import ru.vlapin.experiments.springdatajpademo.dao.CatRepository;
import ru.vlapin.experiments.springdatajpademo.model.Cat;

@Component
@RequiredArgsConstructor
public class DataJpaIniter implements InitializingBean {

  CatRepository catRepository;

  @Override
  public void afterPropertiesSet() {
    Stream.of("Мурзик, Барсик, Матроскин, Том".split(", "))
      .map(Cat::Cat)
      .forEach(catRepository::save);
  }
}
