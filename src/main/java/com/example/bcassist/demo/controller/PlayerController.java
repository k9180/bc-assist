package com.example.bcassist.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.bcassist.demo.repository.PlayerRepository;
import com.example.bcassist.demo.repository.PlayerStatsRepository;
import com.example.bcassist.demo.model.Player;
import com.example.bcassist.demo.model.PlayerStats;
import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerStatsRepository playerStatsRepository;

    @GetMapping("/player/{id}")
    public String getPlayerStats(@PathVariable Long id, Model model) {
        Player player = playerRepository.findById(id).orElse(null);  // Use .orElse(null) to handle Optional

        if (player == null) {
            return "playerNotFound"; // You would need to create a "playerNotFound.html" template
        }
        

        List<PlayerStats> stats = playerStatsRepository.findByPlayerId(id);

        model.addAttribute("player", player);
        model.addAttribute("stats", stats);

        return "playerStats"; // You would need a corresponding HTML template
    }
}
