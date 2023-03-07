/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.services;

import com.dfamily.chessDemo.models.Game;
import com.dfamily.chessDemo.models.dtos.GameDto;
import com.dfamily.chessDemo.models.mappers.ChessGameMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author johns
 */
@Service("ChessSvc")
public class ChessGameServiceImpl implements ChessGameService {
    
    @Autowired
    ChessGameMapper chessGameMapper;

    @Override
    public GameDto newChessGame() {
        return this.chessGameMapper.ToDto(new Game());
    }

    @Override
    public List<GameDto> listChessGames() {
        List<Game> lg = new ArrayList<>();
        
        for(int i=0; i<10;i++){
            lg.add(new Game());
        }
        return this.chessGameMapper.ToDto(lg);
    }
    
    
    
}
