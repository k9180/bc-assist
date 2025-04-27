package com.example.bcassist.demo.controller;

import com.example.bcassist.demo.model.Players;
import com.example.bcassist.demo.repository.PlayersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/players")
@CrossOrigin(origins = "*")
public class PlayersController {
    private final PlayersRepository playersRepository;

    public PlayersController(PlayersRepository playersRepository) {
        this.playersRepository = playersRepository;
    }

    @GetMapping
    public List<Players> getAllPlayers() {
        return playersRepository.findAll();
    }

    @PostMapping
    public Players createPlayer(@RequestBody Players players) {
        return playersRepository.save(players);
    }
}
