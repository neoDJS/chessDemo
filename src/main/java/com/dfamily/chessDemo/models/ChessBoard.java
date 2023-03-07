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
    private Game game;
    private List<BoardCase> cases;

    public ChessBoard() {
    }

    public ChessBoard(Game newG) {
        this.cases = new ArrayList<>();
        String[] h = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for(int i=1; i<=8; i++){
            for(String el:h){
                cases.add(new BoardCase(this, el+i));
            }
        }
        System.out.println("Chess Board initialized!");
    }

    public int getBoardID() {
        return boardID;
    }

    public void setBoardID(int boardID) {
        this.boardID = boardID;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<BoardCase> getCases() {
        return cases;
    }

    public void setCases(List<BoardCase> cases) {
        this.cases = cases;
    }
    
}
