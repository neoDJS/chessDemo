/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers;

import com.dfamily.chessDemo.models.ChessBoard;
import com.dfamily.chessDemo.models.dtos.ChessBoardDto;
import com.dfamily.chessDemo.models.mappers.Factory.PieceMapperFactory;
import com.dfamily.chessDemo.models.mappers.Factory.PlayerMapperFactory;
import org.mapstruct.Mapper;

/**
 *
 * @author johns
 */
@Mapper(componentModel = "boardMp", uses={PieceMapperFactory.class, PlayerMapperFactory.class})
public interface BoardGameMapper {
    ChessBoardDto ToDto(ChessBoard source);
    ChessBoard ToEntity(ChessBoardDto destination);
    
}
