package com.example.bcassist.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Player {
    @Id
    private Long id;
    private String name;
    private String team;
    private String position;

    @OneToMany(mappedBy = "player")
    private List<PlayerStats> stats;
}
