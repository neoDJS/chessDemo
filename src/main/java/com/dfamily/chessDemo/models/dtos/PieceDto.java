/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.dtos;

import com.dfamily.chessDemo.models.moves.Move;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author johns
 */

public class PieceDto implements Serializable {
    private PlayerDto owner = null;
    private int pieceID;
    private String pieceNameLetter;
    private String initPosition = null;
    private BoardCaseDto position = null;
    private int maxMove;
    private List<Move> movingWay = null;

    public PlayerDto getOwner() {
        return owner;
    }

    public void setOwner(PlayerDto owner) {
        this.owner = owner;
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

    public BoardCaseDto getPosition() {
        return position;
    }

    public void setPosition(BoardCaseDto position) {
        if(position != null && position.getP() == null)
            position.setP(this);
        this.position = position;
    }

    public int getMaxMove() {
        return maxMove;
    }

    public void setMaxMove(int maxMove) {
        this.maxMove = maxMove;
    }

    public List<Move> getMovingWay() {
        return movingWay;
    }

    public void setMovingWay(List<Move> movingWay) {
        this.movingWay = movingWay;
    }
}
