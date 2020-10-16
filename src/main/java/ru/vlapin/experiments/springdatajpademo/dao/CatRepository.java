package ru.vlapin.experiments.springdatajpademo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.springdatajpademo.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
