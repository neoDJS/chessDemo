/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models;

import com.dfamily.chessDemo.models.moves.Move;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author johns
 */

public abstract class Piece {
    private Player owner = null;
    private int pieceID;
    private String pieceNameLetter;
    private String initPosition = null;
    private BoardCase position = null;
    private int maxMove;
    private List<Move> movingWay = null;
    
    protected abstract void buildMoves(); 
    
    protected void moveTo(String caseName){
        List<BoardCase> moves = validMove();
        BoardCase newCase = moves.stream()
                    .filter(c -> c.getNameID().equals(caseName))
                    .findFirst().get();
        if(moves.stream().map(c -> c.getNameID()).collect(Collectors.toList()).contains(caseName)){
            this.getPosition().setP(null);
            if(newCase.getP() != null)
                newCase.getP().setPosition(null);
            this.setPosition(moves.stream()
                    .filter(c -> c.getNameID().equals(caseName))
                    .findFirst().get());
        }
    }
    
    public int getInitBoardCase(){
        int t = this.getInitPosition().chars().reduce((a, b) -> (b-49)*8+(a-97)).orElse(0);
        System.out.println("CaseID: "+this.getInitPosition()+", caseNum: "+t);
      return t;
    }
    
    public List<BoardCase> validMove() {
        List<BoardCase> moveCases = new ArrayList<>();
        int i=1;
        this.getMovingWay().forEach(m -> {
                    List<BoardCase> mCases = new ArrayList<>();
                    while((i <= this.getMaxMove()) || (i>1 && !mCases.isEmpty())){
                        mCases.addAll( m.nextMove(this.getPosition(), 
                                moveCases.stream().filter(c -> c.getP() == null).collect(Collectors.toList())));
                    }
                    moveCases.addAll(mCases);
                    
                });
        
        return moveCases;
    }
    
    public String getOnBoardName(){
        return this.getPosition()!= null? this.getPieceNameLetter() +"-"+ this.getPosition().getNameID() : this.getPieceNameLetter();
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
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

    public BoardCase getPosition() {
        return position;
    }

    public void setPosition(BoardCase position) {
        this.position = position;
        if(position != null && position.getP() == null)
            position.setP(this);
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
