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
public class MoveDiagonalA8H1FwdImpl implements MoveDiagonalA8H1 {
    private static MoveDiagonalA8H1 instance;

    private MoveDiagonalA8H1FwdImpl() {
    }

    public static MoveDiagonalA8H1 getInstance() {
        if (instance == null) {
            instance = new MoveDiagonalA8H1FwdImpl();
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
                            int distanceX = Math.abs(first.getNameID().charAt(0) - c.getNameID().charAt(0));
                            int distanceY = Math.abs(first.getNameID().charAt(1) - c.getNameID().charAt(1));
                            return (distanceX == distanceY && 
                                    (("White".equals(first.getP().getOwner().getColor()) && (first.getNameID().charAt(1)+distanceY < 8 && first.getNameID().charAt(1)-distanceX < 'a') && 
                                    ((c2.getNameID().charAt(0) == first.getNameID().charAt(0)-distanceX-1)&&(c2.getNameID().charAt(1) == first.getNameID().charAt(1)+distanceY+1))) ||
                                    ("Black".equals(first.getP().getOwner().getColor()) && (first.getNameID().charAt(1)-distanceY > 1 && first.getNameID().charAt(1)+distanceX < 'h') && 
                                    ((c2.getNameID().charAt(0) == first.getNameID().charAt(0)+distanceX+1)&&(c2.getNameID().charAt(1) == first.getNameID().charAt(1)-distanceY-1)))
                                    ));
                        })
                        .filter(c3 -> (c3.getP() == null) || 
                                (c3.getP() != null && !first.getP().getOwner().getColor().equals(c3.getP().getOwner().getColor())))
                        .collect(Collectors.toList()))
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());
    }
    
}
