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
import java.util.List;

/**
 *
 * @author johns
 */
public class BlackPlayer extends Player {

    public BlackPlayer() {
    }

    public BlackPlayer(String newP) {
        super.setPlayerID(2);
        super.setColor("Black");
    }
    
    @Override
    protected void buildPieces() {
        String[] h = {"a", "b", "c", "d", "e", "f", "g", "h"};
        List<Piece> pcs = this.getPieces();
        pcs.add(new King(h[4]+8));
        pcs.add(new Queen(h[3]+8));
        pcs.add(new Rook(h[0]+8));
        pcs.add(new Rook(h[7]+8));
        pcs.add(new Knight(h[1]+8));
        pcs.add(new Knight(h[6]+8));
        pcs.add(new Bishop(h[2]+8));
        pcs.add(new Bishop(h[5]+8));
        for(int i=0; i<4; i++){
            pcs.add(new Pawn(h[i]+7));
            pcs.add(new Pawn(h[7-i]+7));
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
