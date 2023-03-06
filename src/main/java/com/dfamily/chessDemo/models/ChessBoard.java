/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johns
 */
public class ChessBoard {
    private int boardID;
    private List<BoardCase> cases;

    public ChessBoard() {
    }

    public ChessBoard(String newB) {
        this.cases = new ArrayList<>();
        String[] h = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for(String el:h){
            for(int i=1; i<=8; i++){
                cases.add(new BoardCase(this, el+i));
            }
        }
    }

    public int getBoardID() {
        return boardID;
    }

    public void setBoardID(int boardID) {
        this.boardID = boardID;
    }

    public List<BoardCase> getCases() {
        return cases;
    }

    public void setCases(List<BoardCase> cases) {
        this.cases = cases;
    }
    
}
