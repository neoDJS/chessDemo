/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.controller;

import com.dfamily.chessDemo.models.Game;
import com.dfamily.chessDemo.services.ChessGameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author johns
 */
public class ChessGameController {
    
    @Autowired
    ChessGameService chessSvc;
    
    @GetMapping(path="/chess/games/new", produces = "application/json")
    public Game getnewChessGame(){
        return chessSvc.newChessGame();
    }
    
    @GetMapping(path="/chess/games", produces = "application/json")
    public List<Game> getListChessGames(){
        return chessSvc.listChessGames();
    }
    
}
