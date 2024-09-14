package com.cats.CatsBackend.logic;

import com.cats.CatsBackend.data.Cat;
import com.cats.CatsBackend.repository.CatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public Cat saveCat(Cat cat) {
        return catRepository.save(cat);
    }

    public List<Cat> findAll() {
        return catRepository.findAll();
    }

    public Cat findById(String id) {
        UUID uuid = UUID.fromString(id);
        return catRepository.findById(uuid);
    }
}
