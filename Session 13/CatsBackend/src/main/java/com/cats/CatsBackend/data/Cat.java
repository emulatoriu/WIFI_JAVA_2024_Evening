package com.cats.CatsBackend.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "cat")
@NoArgsConstructor
@Data
public class Cat {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String breed;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User owner;
}
