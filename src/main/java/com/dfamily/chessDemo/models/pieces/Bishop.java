/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.pieces;

import com.dfamily.chessDemo.models.Piece;
import com.dfamily.chessDemo.models.Player;
import com.dfamily.chessDemo.models.moves.MoveDiagonalA8H1FullImpl;
import com.dfamily.chessDemo.models.moves.MoveDiagonalA1H8FullImpl;
import java.util.ArrayList;

/**
 *
 * @author johns
 */
public final class Bishop extends Piece {

    public Bishop() {
    }

    public Bishop(Player owner, String initPosition) {
        super.setPieceNameLetter("B");
        super.setInitPosition(initPosition);
        super.setMaxMove(8);
        super.setOwner(owner);
        super.setMovingWay(new ArrayList<>());
        buildMoves();
    }

    @Override
    protected void buildMoves() {
        this.getMovingWay().add(new MoveDiagonalA1H8FullImpl());
        this.getMovingWay().add(new MoveDiagonalA8H1FullImpl());
    }
    
}
