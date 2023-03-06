/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers;

import com.dfamily.chessDemo.models.Piece;
import com.dfamily.chessDemo.models.dtos.PieceDto;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author johns
 */
@Mapper(componentModel = "pieceMp")
public interface PieceMapper {
    PieceDto ToDto(Piece source);
    Piece ToEntity(PieceDto destination);
    List<PieceDto> ToDto(List<Piece> source);
    List<Piece> ToEntity(List<PieceDto> destination);
    
}
