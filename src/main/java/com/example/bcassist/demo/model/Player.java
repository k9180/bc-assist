package com.example.bcassist.demo.model;

import jakarta.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String team;
    private int points;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }
    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }
}
