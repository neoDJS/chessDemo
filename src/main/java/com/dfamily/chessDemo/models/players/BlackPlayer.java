/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.players;

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
public final class BlackPlayer extends Player {

    public BlackPlayer() {
    }

    public BlackPlayer(Game newG) {
        super.setPieces(new ArrayList<>());
        super.setPlayerID(2);
        super.setColor("Black");
        buildPieces();
        initPiecesBoardPosition();
    }
    
    @Override
    protected void buildPieces() {
        String[] h = {"a", "b", "c", "d", "e", "f", "g", "h"};
        List<Piece> pcs = this.getPieces();
        pcs.add(new King(this, h[4]+8));
        pcs.add(new Queen(this, h[3]+8));
        pcs.add(new Rook(this, h[0]+8));
        pcs.add(new Rook(this, h[7]+8));
        pcs.add(new Knight(this, h[1]+8));
        pcs.add(new Knight(this, h[6]+8));
        pcs.add(new Bishop(this, h[2]+8));
        pcs.add(new Bishop(this, h[5]+8));
        for(int i=0; i<4; i++){
            pcs.add(new Pawn(this, h[i]+7));
            pcs.add(new Pawn(this, h[7-i]+7));
        }
    }

    @Override
    public void initPiecesBoardPosition() {
        this.getPieces().forEach((p) -> {
            this.getGame().getBoard().getCases().stream()
                    .filter(c -> c.getNameID().equalsIgnoreCase(p.getInitPosition()))
                    .findFirst()
                    .get().setP(p);
        });
    }
    
}
