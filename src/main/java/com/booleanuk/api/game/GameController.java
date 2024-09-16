package com.booleanuk.api.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("games")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    /*
    @GetMapping
    public ResponseEntity<GenericResponse> getAll() {
        return new ResponseEntity<>(new GamesResponse(this.gameRepository.findAll()), HttpStatus.OK);
    }

     */

    @GetMapping
    public List<Game> getAllGames(){
        return this.gameRepository.findAll();
    }

}
