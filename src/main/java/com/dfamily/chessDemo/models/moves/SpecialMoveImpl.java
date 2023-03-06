/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.moves;

import com.dfamily.chessDemo.models.BoardCase;
import java.util.List;

/**
 *
 * @author johns
 */
public class SpecialMoveImpl implements SpecialMove {
    private static SpecialMove instance;

    private SpecialMoveImpl() {
    }

    public static SpecialMove getInstance() {
        if (instance == null) {
            instance = new SpecialMoveImpl();
        }
        return instance;
    }

    @Override
    public List<BoardCase> nextMove(BoardCase first, List<BoardCase> from) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
