/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.players;

import com.dfamily.chessDemo.models.ChessBoard;
import com.dfamily.chessDemo.models.Piece;
import com.dfamily.chessDemo.models.Player;
import com.dfamily.chessDemo.models.pieces.Bishop;
import com.dfamily.chessDemo.models.pieces.King;
import com.dfamily.chessDemo.models.pieces.Knight;
import com.dfamily.chessDemo.models.pieces.Pawn;
import com.dfamily.chessDemo.models.pieces.Queen;
import com.dfamily.chessDemo.models.pieces.Rook;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johns
 */
public final class WhitePlayer extends Player {

    public WhitePlayer() {
    }

    public WhitePlayer(String newP) {
        super.setPieces(new ArrayList<>());
        super.setPlayerID(1);
        super.setColor("White");
        buildPieces();
    }

    @Override
    protected void buildPieces() {
        String[] h = {"a", "b", "c", "d", "e", "f", "g", "h"};
        List<Piece> pcs = this.getPieces();
        pcs.add(new King(h[4]+1));
        pcs.add(new Queen(h[3]+1));
        pcs.add(new Rook(h[0]+1));
        pcs.add(new Rook(h[7]+1));
        pcs.add(new Knight(h[1]+1));
        pcs.add(new Knight(h[6]+1));
        pcs.add(new Bishop(h[2]+1));
        pcs.add(new Bishop(h[5]+1));
        for(int i=0; i<4; i++){
            pcs.add(new Pawn(h[i]+2));
            pcs.add(new Pawn(h[7-i]+2));
        }
    }

    @Override
    public void initPiecesBoardPosition(ChessBoard b) {
        for(Piece p: this.getPieces()){
            b.getCases().stream()
                    .filter(c -> c.getNameID().equalsIgnoreCase(p.getInitPosition()))
                    .findFirst()
                    .get().setP(p);
        }
    }
    
}
