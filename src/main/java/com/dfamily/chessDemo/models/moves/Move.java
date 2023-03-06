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
public interface Move {
    public List<BoardCase> nextMove(BoardCase first, List<BoardCase> from);    
}
