/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.controller;

import com.dfamily.chessDemo.models.dtos.GameDto;
import com.dfamily.chessDemo.services.ChessGameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author johns
 */
@RestController
@RequestMapping("/chess")
public class ChessGameController {
    
    @Autowired
    ChessGameService chessSvc;
    
    @GetMapping(path="/games/new", produces = "application/json")
    public GameDto getnewChessGame(){
        return chessSvc.newChessGame();
    }
    
    @GetMapping(path="/games", produces = "application/json")
    public List<GameDto> getListChessGames(){
        return chessSvc.listChessGames();
    }
    
}
