package com.example.bcassist.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PlayerStats {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    private String gameDate;
    private int points;
    private int assists;
    private int rebounds;
    private String gameOutcome;

}
