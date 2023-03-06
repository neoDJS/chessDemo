/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models;

import com.dfamily.chessDemo.models.BoardCase;
import com.dfamily.chessDemo.models.Player;

/**
 *
 * @author johns
 * @param <P>
 */

public abstract class Piece<P> {
//    private Player owner = null;
    private int pieceID;
    private String initPosition = null;
    private BoardCase position = null;
    protected abstract void moveTo(String caseName);
    protected abstract BoardCase[] validMove();
}
