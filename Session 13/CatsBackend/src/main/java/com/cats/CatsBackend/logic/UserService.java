package com.cats.CatsBackend.logic;

import com.cats.CatsBackend.data.User;
import com.cats.CatsBackend.exception.UserNotFoundException;
import com.cats.CatsBackend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findById(String id) {
        UUID uuid;
        try {
            uuid = UUID.fromString(id);
        } catch (IllegalArgumentException iae) {
            throw new UserNotFoundException();
        }
        return userRepository
                .findById(uuid)
                .orElseThrow(() -> new UserNotFoundException());
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
