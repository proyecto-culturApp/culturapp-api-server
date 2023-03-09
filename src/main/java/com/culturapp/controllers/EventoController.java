package com.culturapp.controllers;

import com.culturapp.controllers.repositories.EventoRepository;
import com.culturapp.entities.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private EventoRepository eventoRepository;

    @PostMapping("/nuevo")
    public ResponseEntity<Evento> crearEvento(@RequestBody Evento evento) {
        Evento eventoGuardado = eventoRepository.save(evento);
        return ResponseEntity.ok(eventoGuardado);
    }
}