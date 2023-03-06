/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.dtos;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author johns
 */
public class ChessBoardDto implements Serializable {
    private int boardID;
    private GameDto game;
    private List<BoardCaseDto> cases;

    public int getBoardID() {
        return boardID;
    }

    public void setBoardID(int boardID) {
        this.boardID = boardID;
    }

    public GameDto getGame() {
        return game;
    }

    public void setGame(GameDto game) {
        this.game = game;
    }

    public List<BoardCaseDto> getCases() {
        return cases;
    }

    public void setCases(List<BoardCaseDto> cases) {
        this.cases = cases;
    }
    
}
