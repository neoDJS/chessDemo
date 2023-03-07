/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers.Factory;

import com.dfamily.chessDemo.models.Piece;
import com.dfamily.chessDemo.models.dtos.PieceDto;
import com.dfamily.chessDemo.models.pieces.Bishop;
import com.dfamily.chessDemo.models.pieces.King;
import com.dfamily.chessDemo.models.pieces.Knight;
import com.dfamily.chessDemo.models.pieces.Pawn;
import com.dfamily.chessDemo.models.pieces.Queen;
import com.dfamily.chessDemo.models.pieces.Rook;
import org.mapstruct.ObjectFactory;

/**
 *
 * @author johns
 */
public class PieceMapperFactory {
    
    
    
    @ObjectFactory
    public Piece createPiece(PieceDto dto) {
        Piece p;
        switch(dto.getPieceNameLetter()){
            case "K": p = new King();
                      break;
            case "Q": p = new Queen();
                      break;
            case "B": p = new Bishop();
                      break;
            case "C": p = new Knight();
                      break;
            case "R": p = new Rook();
                      break;
            case "P": p = new Pawn();
                      break;
            default: p = new Pawn();
        }
        
        p.setInitPosition(dto.getInitPosition());
        p.setMaxMove(dto.getMaxMove());
        p.setMovingWay(dto.getMovingWay());
//        p.setOwner(dto.getOwner()));
        p.setPieceID(dto.getPieceID());
        p.setPieceNameLetter(dto.getPieceNameLetter());
//        p.setPosition(dto.getPosition());
        return p;
    }
    
}
