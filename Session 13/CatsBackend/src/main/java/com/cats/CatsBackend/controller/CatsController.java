package com.cats.CatsBackend.controller;

import com.cats.CatsBackend.data.Cat;
import com.cats.CatsBackend.logic.CatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CatsController {
    private final CatService catService;
    @PostMapping("save")
    Cat save(@RequestBody Cat cat) {
        Cat savedCat = catService.saveCat(cat);
        return savedCat;
    }

    @GetMapping("findAll")
    List<Cat> findAll() {
        return catService.findAll();
    }

    @GetMapping("findById")
    Cat findById(@RequestParam String id) {
        return catService.findById(id);
    }
}
