package com.cats.CatsBackend.repository;

import com.cats.CatsBackend.data.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.UUID;

public interface CatRepository extends Repository<Cat, UUID> {
    Cat save(Cat cat);
    List<Cat> findAll();
    Cat findById(UUID id);
    List<Cat> findCatsByBreed(String breed);
}
