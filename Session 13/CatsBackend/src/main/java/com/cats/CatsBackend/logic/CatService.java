package com.cats.CatsBackend.logic;

import com.cats.CatsBackend.data.Cat;
import com.cats.CatsBackend.data.CatDTO;
import com.cats.CatsBackend.data.User;
import com.cats.CatsBackend.repository.CatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CatService {
    private final CatRepository catRepository;
    private final UserService userService;

    public Cat saveCat(CatDTO catDTO) {
        Cat cat = new Cat();
        cat.setBreed(catDTO.breed());
        cat.setName(catDTO.name());
        User foundUser = userService.findById(catDTO.id());
        cat.setOwner(foundUser);
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
