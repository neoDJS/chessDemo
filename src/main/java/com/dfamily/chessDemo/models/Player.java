/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author johns
 */
public abstract class Player {
    private int playerID;
    private String name = null;
    private String color = null;
    private Game game = null;
    private List<Piece> pieces = null;
    
    public String plays(){
        final String fromCase, toCase;
        
        System.out.println("Saisi la piece a deplacer, dans la liste suivante");
        String casesString = pieces.stream()
                .filter(p -> p.getOnBoardName().length() >= 3)
                .map(p -> p.getOnBoardName())
                .reduce("", (sub, el) ->  sub+", "+el);
        System.out.println(casesString);
        fromCase = readPlayerAction(1);
        
        Piece p1 = pieces.stream()
                .filter(p -> p.getOnBoardName().equals(fromCase))
                .findFirst()
                .get();
        
        System.out.println("Saisi la case ou il faut la placer");
        toCase = readPlayerAction(2);
        p1.moveTo(toCase);
        
        return toCase;
    }
    
    public String plays(String fromCase, String toCase){
        pieces.stream()
                .filter(p -> p.getOnBoardName().equals(fromCase))
                .findFirst()
                .get()
                .moveTo(toCase);
        
        return toCase;
    }
    
    private String readPlayerAction(int action){
        Scanner r = new Scanner(System.in);
        String scan = "";
        boolean isValid = false;
        while(r.hasNextLine() && !isValid) {
            scan = r.nextLine();
            if(action == 1 && scan.length()>0 && isValidCaseName(scan.substring(scan.length()-1))) {
                isValid = true; 
                break;
            }
            if(action == 2 && scan.length()>0 && isValidCaseName(scan)) {
                isValid = true; 
                break;
            }
        }
        if(r!=null) r.close();
        return scan;
    }
    
    public boolean isCheckMate(String pc){
        Piece k = this.pieces.stream()
                .filter(p -> "King".equals(p.getClass().getName()))
                .findFirst()
                .get();
        return k.getPosition().getB().getCases().stream()
                .filter(c -> c.getNameID().equals(pc))
                .findFirst()
                .get()
                .getP()
                .validMove().contains(k.getPosition()) && 
                k.validMove().isEmpty();
    }
    
    private boolean isValidCaseName(String caseName){
        return (caseName.length() == 2) && 
                ("abcdefgh".contains(""+caseName.toLowerCase().charAt(0))) && 
                ("12345678".contains(""+caseName.charAt(1)));
    }
    
    protected abstract void buildPieces(); 
    public abstract void initPiecesBoardPosition();
    
    protected boolean validPiecesCount(){
        return pieces != null && pieces.size() == 16;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerId) {
        this.playerID = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }
}
