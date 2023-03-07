/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.pieces;

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
public final class King extends PieceImpl {

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
        this.getMovingWay().add(MoveDiagonalA1H8FullImpl.getInstance());
        this.getMovingWay().add(MoveDiagonalA8H1FullImpl.getInstance());
        this.getMovingWay().add(MoveASideImpl.getInstance());
        this.getMovingWay().add(MoveForwardImpl.getInstance());
        this.getMovingWay().add(MoveBackwardImpl.getInstance());
        this.getMovingWay().add(SpecialMoveImpl.getInstance());
    }
    
}
