/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.services;

import com.dfamily.chessDemo.models.dtos.GameDto;
import java.util.List;

/**
 *
 * @author johns
 */
public interface ChessGameService {
    
    GameDto newChessGame();
    List<GameDto> listChessGames();
    
}
