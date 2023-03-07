/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers.Factory;

import com.dfamily.chessDemo.models.Player;
import com.dfamily.chessDemo.models.players.PlayerImpl;

/**
 *
 * @author johns
 */
public class PlayerMapperFactory {
    
    public Player createPlayer() {
        return new PlayerImpl();
    }
    
}
