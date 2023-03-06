/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author johns
 */
public abstract class Player {
    private int playerID;
    private String name = null;
    private String color = null;
    private List<Piece> pieces = null;
    
    public String plays(){
        return "";
    }
    
    public boolean isCheckMate(String pc){
        Piece k = this.pieces.stream()
                .filter(p -> "King".equals(p.getClass().getName()))
                .findFirst()
                .get();
        return k.getPosition().getB().getCases().stream()
                .filter(c -> c.getNameID().equals(pc))
                .findFirst()
                .get()
                .getP()
                .validMove().contains(k.getPosition()) && 
                k.validMove().isEmpty();
    }
    
    private boolean validateCasename(String caseName){
        return (caseName.length() == 2) && 
                ("abcdefgh".contains(""+caseName.toLowerCase().charAt(0))) && 
                ("12345678".contains(""+caseName.charAt(1)));
    }
    
    protected abstract void buildPieces(); 
    public abstract void initPiecesBoardPosition(ChessBoard b);
    
    protected boolean validPiecesCount(){
        return pieces != null && pieces.size() == 16;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerId) {
        this.playerID = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }
}
