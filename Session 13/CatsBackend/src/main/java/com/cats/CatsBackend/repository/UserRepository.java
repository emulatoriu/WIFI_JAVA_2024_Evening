package com.cats.CatsBackend.repository;

import com.cats.CatsBackend.data.User;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends Repository<User, UUID> {
    Optional<User> findById(UUID id);
    User save(User user);
    List<User> findAll();
}
