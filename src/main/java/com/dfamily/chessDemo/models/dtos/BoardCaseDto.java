/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.dtos;

import com.dfamily.chessDemo.models.*;
import java.io.Serializable;

/**
 *
 * @author johns
 */
public class BoardCaseDto implements Serializable {
    private String nameID = null;
    private ChessBoardDto b = null;
    private PieceDto p = null;

    public String getNameID() {
        return nameID;
    }
    
    public String getAssociatedName(){
        return this.getP()!= null? this.getP().getPieceNameLetter() +"-"+ this.nameID : this.nameID;
    }

    public void setNameID(String name) {
        this.nameID = name;
    }

    public ChessBoardDto getB() {
        return b;
    }

    public void setB(ChessBoardDto b) {
        this.b = b;
    }

    public PieceDto getP() {
        return p;
    }

    public void setP(PieceDto p) {
        if(p != null && p.getPosition() == null)
            p.setPosition(this);
        this.p = p;
    }
}
