package com.example.bcassist.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bcassist.demo.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    // Remove custom findById method, JpaRepository already provides this
}
