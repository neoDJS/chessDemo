/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.dtos;

import com.dfamily.chessDemo.models.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author johns
 */
public abstract class PlayerDto implements Serializable {
    private int playerID;
    private String name = null;
    private String color = null;
    private Game game = null;
    private List<Piece> pieces = null;

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

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }
}
