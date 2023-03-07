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
public class PlayerDto implements Serializable {
    private int playerID;
    private String name = null;
    private String color = null;
    private GameDto game = null;
    private List<PieceDto> pieces = null;

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

    public GameDto getGame() {
        return game;
    }

    public void setGame(GameDto game) {
        this.game = game;
    }

    public List<PieceDto> getPieces() {
        return pieces;
    }

    public void setPieces(List<PieceDto> pieces) {
        this.pieces = pieces;
    }
}
