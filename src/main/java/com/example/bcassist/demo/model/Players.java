package com.example.bcassist.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "players")  // Ensure table name matches database
public class Players {
    @Id
    @Column(name = "player_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Ensure this matches the database column

    private String name;
    private String team;
    private String position;
    private int gamesPlayed;
    private int points;
}
