/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers.Factory;

import com.dfamily.chessDemo.models.Piece;
import com.dfamily.chessDemo.models.pieces.PieceImpl;

/**
 *
 * @author johns
 */
public class PieceMapperFactory {
    
    public Piece createPiece() {
        return new PieceImpl();
    }
    
}
