package com.example.bcassist.demo.repository;

import com.example.bcassist.demo.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends JpaRepository<Players, Long> {
}
