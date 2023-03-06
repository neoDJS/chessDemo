/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.pieces;

import com.dfamily.chessDemo.models.Piece;
import com.dfamily.chessDemo.models.Player;
import com.dfamily.chessDemo.models.moves.MoveASideImpl;
import com.dfamily.chessDemo.models.moves.MoveBackwardImpl;
import com.dfamily.chessDemo.models.moves.MoveDiagonalA8H1FullImpl;
import com.dfamily.chessDemo.models.moves.MoveDiagonalA1H8FullImpl;
import com.dfamily.chessDemo.models.moves.MoveForwardImpl;
import com.dfamily.chessDemo.models.moves.SpecialMoveImpl;
import java.util.ArrayList;

/**
 *
 * @author johns
 */
public final class King extends Piece {

    public King() {
    }

    public King(Player owner, String initPosition) {
        super.setPieceNameLetter("K");
        super.setInitPosition(initPosition);
        super.setMaxMove(1);
        super.setOwner(owner);
        super.setMovingWay(new ArrayList<>());
        buildMoves();
    }

    @Override
    protected void buildMoves() {
        this.getMovingWay().add(new MoveDiagonalA1H8FullImpl());
        this.getMovingWay().add(new MoveDiagonalA8H1FullImpl());
        this.getMovingWay().add(new MoveASideImpl());
        this.getMovingWay().add(new MoveForwardImpl());
        this.getMovingWay().add(new MoveBackwardImpl());
        this.getMovingWay().add(new SpecialMoveImpl());
    }
    
}
