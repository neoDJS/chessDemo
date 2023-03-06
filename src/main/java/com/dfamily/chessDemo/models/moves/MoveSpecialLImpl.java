/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.moves;

import com.dfamily.chessDemo.models.BoardCase;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author johns
 */
public class MoveSpecialLImpl implements MoveSpecialL {
    private static MoveSpecialL instance;

    private MoveSpecialLImpl() {
    }

    public static MoveSpecialL getInstance() {
        if (instance == null) {
            instance = new MoveSpecialLImpl();
        }
        return instance;
    }

    @Override
    public List<BoardCase> nextMove(BoardCase first, List<BoardCase> from) {
        if(from.isEmpty())
            from.add(first);
        
        return from.stream()
                .map(c -> c.getB().getCases().stream()
                        .filter(c1 -> (from.size()==1 && c.getP() != null && c.getNameID().equals(first.getNameID())) ||
                                (from.size()>=1 && c.getP() == null && !c.getNameID().equals(first.getNameID())))
                        .filter(c2 -> {
                            int distanceX = Math.abs(first.getNameID().charAt(0) - c2.getNameID().charAt(0));
                            int distanceY = Math.abs(first.getNameID().charAt(1) - c2.getNameID().charAt(1));
                            return (distanceX > 0 && distanceY > 0 && distanceX + distanceY == 3);
                        })
                        .filter(c3 -> (c3.getP() == null) || 
                                (c3.getP() != null && !first.getP().getOwner().getColor().equals(c3.getP().getOwner().getColor())))
                        .collect(Collectors.toList()))
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());
    }
    
}
