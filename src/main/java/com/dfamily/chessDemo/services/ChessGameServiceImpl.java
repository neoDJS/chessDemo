/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.services;

import com.dfamily.chessDemo.models.Game;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author johns
 */
@Service("ChessSvc")
public class ChessGameServiceImpl implements ChessGameService {

    @Override
    public Game newChessGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Game> listChessGames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
