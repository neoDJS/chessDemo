/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models;

import com.dfamily.chessDemo.models.BoardCase;
import com.dfamily.chessDemo.models.Player;
import java.util.List;

/**
 *
 * @author johns
 * @param <P>
 */

public abstract class Piece<P> {
//    private Player owner = null;
    private int pieceID;
    private String pieceNameLetter;
    private String initPosition = null;
    private BoardCase position = null;
    protected abstract void moveTo(String caseName);
    public abstract List<BoardCase> validMove();
    
    public String getOnBoardName(){
        return this.getPosition()!= null? this.pieceNameLetter + this.getPosition().getNameID() : this.pieceNameLetter;
    }

    public int getPieceID() {
        return pieceID;
    }

    public void setPieceID(int pieceID) {
        this.pieceID = pieceID;
    }

    public String getPieceNameLetter() {
        return pieceNameLetter;
    }

    public void setPieceNameLetter(String pieceNameLetter) {
        this.pieceNameLetter = pieceNameLetter;
    }

    public String getInitPosition() {
        return initPosition;
    }

    public void setInitPosition(String initPosition) {
        this.initPosition = initPosition;
    }

    public BoardCase getPosition() {
        return position;
    }

    public void setPosition(BoardCase position) {
        this.position = position;
    }
}
