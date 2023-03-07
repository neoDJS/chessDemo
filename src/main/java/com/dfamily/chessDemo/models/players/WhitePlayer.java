/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.players;

import com.dfamily.chessDemo.models.ChessBoard;
import com.dfamily.chessDemo.models.Game;
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

    public WhitePlayer(Game newG) {
        super.setPieces(new ArrayList<>());
        super.setPlayerID(1);
        super.setColor("White");
        buildPieces();
        System.out.println("White Player initialized!");
    }

    @Override
    protected void buildPieces() {
        String[] h = {"a", "b", "c", "d", "e", "f", "g", "h"};
        List<Piece> pcs = this.getPieces();
        pcs.add(new King(this, h[4]+1));
        pcs.add(new Queen(this, h[3]+1));
        pcs.add(new Rook(this, h[0]+1));
        pcs.add(new Rook(this, h[7]+1));
        pcs.add(new Knight(this, h[1]+1));
        pcs.add(new Knight(this, h[6]+1));
        pcs.add(new Bishop(this, h[2]+1));
        pcs.add(new Bishop(this, h[5]+1));
        for(int i=0; i<4; i++){
            pcs.add(new Pawn(this, h[i]+2));
            pcs.add(new Pawn(this, h[7-i]+2));
        }
    }

    @Override
    public void initPiecesBoardPosition(ChessBoard b) {
        this.getPieces().forEach((p) -> b.getCases().get(p.getInitBoardCase()).setP(p));
    }
    
}
