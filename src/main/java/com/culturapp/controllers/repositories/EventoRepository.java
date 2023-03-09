package com.culturapp.controllers.repositories;

import com.culturapp.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    Evento save(Evento evento);
}
