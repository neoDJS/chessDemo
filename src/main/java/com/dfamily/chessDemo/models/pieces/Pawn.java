/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.pieces;

import com.dfamily.chessDemo.models.Player;
import com.dfamily.chessDemo.models.moves.MoveDiagonalA1H8FwdImpl;
import com.dfamily.chessDemo.models.moves.MoveDiagonalA8H1FwdImpl;
import com.dfamily.chessDemo.models.moves.MoveForwardImpl;
import java.util.ArrayList;

/**
 *
 * @author johns
 */
public final class Pawn extends PieceImpl {

    public Pawn() {
    }

    public Pawn(Player owner, String initPosition) {
        super.setPieceNameLetter("P");
        super.setInitPosition(initPosition);
        super.setMaxMove(8);
        super.setOwner(owner);
        super.setMovingWay(new ArrayList<>());
        buildMoves();
    }

    @Override
    protected void buildMoves() {
        this.getMovingWay().add(MoveDiagonalA1H8FwdImpl.getInstance());
        this.getMovingWay().add(MoveDiagonalA8H1FwdImpl.getInstance());
        this.getMovingWay().add(MoveForwardImpl.getInstance());
    }
    
}
