/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.pieces;

import com.dfamily.chessDemo.models.BoardCase;
import com.dfamily.chessDemo.models.Piece;
import java.util.List;

/**
 *
 * @author johns
 */
public class Queen extends Piece {

    public Queen() {
    }

    public Queen(String initPosition) {
        this.setPieceNameLetter("Q");
        this.setInitPosition(initPosition);
    }

    @Override
    protected void moveTo(String caseName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BoardCase> validMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
