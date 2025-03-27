package com.example.bcassist.demo.repository;

import com.example.bcassist.demo.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
