/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models;

import com.dfamily.chessDemo.models.players.BlackPlayer;
import com.dfamily.chessDemo.models.players.WhitePlayer;

/**
 *
 * @author johns
 */
public class Game {
    private String gameID;
    private int turnCount;
    private Player player1;
    private Player player2;
    private ChessBoard board;

    public Game() {
    }

    public Game(String newG) {
        this.turnCount = 0;
        this.board = new ChessBoard("");
        this.player1 = new WhitePlayer("");
        this.player2 = new BlackPlayer("");
    }
    
    public void run(){
        int turn;
        boolean mate = player1.isCheckMate() || player2.isCheckMate();
        while(!mate){
            turn = whoIsTurn();
            if(turn == 1) {
                player1.plays();
                mate = player2.isCheckMate();
            } else {
                player2.plays();
                mate = player1.isCheckMate();
            }
            
            if(mate) {
                System.out.print("Player${turn} win!");
                return;
            } else {
                this.turnCount++;
            }
        }
    }
    
    private int whoIsTurn(){
        return turnCount%2 + 1;
    }

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

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public ChessBoard getBoard() {
        return board;
    }

    public void setBoard(ChessBoard board) {
        this.board = board;
    }
}
