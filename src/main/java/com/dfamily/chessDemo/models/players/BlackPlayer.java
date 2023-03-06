/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.players;

import com.dfamily.chessDemo.models.ChessBoard;
import com.dfamily.chessDemo.models.Player;

/**
 *
 * @author johns
 */
public class BlackPlayer extends Player {

    public BlackPlayer() {
    }

    public BlackPlayer(String newP) {
        super.setPlayerID(2);
        super.setColor("Black");
    }
    
    @Override
    protected void buildPieces() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initPiecesBoardPosition(ChessBoard b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
