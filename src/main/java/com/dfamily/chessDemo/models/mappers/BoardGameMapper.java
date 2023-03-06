/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers;

import com.dfamily.chessDemo.models.ChessBoard;
import com.dfamily.chessDemo.models.dtos.ChessBoardDto;
import org.mapstruct.Mapper;

/**
 *
 * @author johns
 */
@Mapper(componentModel = "boardMp")
public interface BoardGameMapper {
    ChessBoardDto ToDto(ChessBoard source);
    ChessBoard ToEntity(ChessBoardDto destination);
    
}
