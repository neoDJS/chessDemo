/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.dtos;

import java.io.Serializable;

/**
 *
 * @author johns
 */
public class GameDto implements Serializable {
    private String gameID;
    private int turnCount;
    private PlayerDto player1;
    private PlayerDto player2;
    private ChessBoardDto board;
    private boolean mate;

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public int getTurnCount() {
        return turnCount;
    }

    public void setTurnCount(int turnCount) {
        this.turnCount = turnCount;
    }

    public PlayerDto getPlayer1() {
        return player1;
    }

    public void setPlayer1(PlayerDto player1) {
        this.player1 = player1;
    }

    public PlayerDto getPlayer2() {
        return player2;
    }

    public void setPlayer2(PlayerDto player2) {
        this.player2 = player2;
    }

    public ChessBoardDto getBoard() {
        return board;
    }

    public void setBoard(ChessBoardDto board) {
        this.board = board;
    }

    public boolean isMate() {
        return mate;
    }

    public void setMate(boolean mate) {
        this.mate = mate;
    }
}
