/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers;

import com.dfamily.chessDemo.models.Game;
import com.dfamily.chessDemo.models.dtos.GameDto;
import com.dfamily.chessDemo.models.mappers.Factory.PieceMapperFactory;
import com.dfamily.chessDemo.models.mappers.Factory.PlayerMapperFactory;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author johns
 */
@Mapper(componentModel = "spring", uses={PieceMapperFactory.class, PlayerMapperFactory.class})
public interface ChessGameMapper {
    GameDto ToDto(Game source);
    Game ToEntity(GameDto destination);
    List<GameDto> ToDto(List<Game> source);
    List<Game> ToEntity(List<GameDto> destination);
    
}
