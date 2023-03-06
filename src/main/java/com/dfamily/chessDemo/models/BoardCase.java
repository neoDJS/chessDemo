/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models;

/**
 *
 * @author johns
 */
public class BoardCase {
    private String nameID = null;
    private ChessBoard b = null;
    private Piece p = null;

    public BoardCase() {
    }

    public BoardCase(ChessBoard b, String name) {
        this.b = b;
        this.nameID = name;
    }

    public String getNameID() {
        return nameID;
    }
    
    public String getPieceCaseName(){
        return this.getP()!= null? this.getP().getPieceNameLetter() + this.nameID : this.nameID;
    }

    public void setNameID(String name) {
        this.nameID = name;
    }

    public ChessBoard getB() {
        return b;
    }

    public void setB(ChessBoard b) {
        this.b = b;
    }

    public Piece getP() {
        return p;
    }

    public void setP(Piece p) {
        this.p = p;
    }
}
