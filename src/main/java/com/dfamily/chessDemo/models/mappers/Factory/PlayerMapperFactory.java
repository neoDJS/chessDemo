/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers.Factory;

import com.dfamily.chessDemo.models.Player;
import com.dfamily.chessDemo.models.dtos.PlayerDto;
import com.dfamily.chessDemo.models.players.BlackPlayer;
import com.dfamily.chessDemo.models.players.WhitePlayer;
import org.mapstruct.ObjectFactory;

/**
 *
 * @author johns
 */
public class PlayerMapperFactory {
    
    @ObjectFactory
    public Player createPlayer(PlayerDto dto) {
        Player p;
        switch(dto.getColor()){
            case "White": p = new WhitePlayer();
                          break;
            case "Black": p = new BlackPlayer();
                          break;
            default: p = new WhitePlayer();
        }
        
        p.setColor(dto.getColor());
//        p.setGame(dto.getGame());
        p.setName(dto.getName());
//        p.setPieces(dto.getPieces());
        p.setPlayerID(dto.getPlayerID());
        return p;
    }
    
}
