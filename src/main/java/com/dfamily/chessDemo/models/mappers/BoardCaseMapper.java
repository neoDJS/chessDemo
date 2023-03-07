/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers;

import com.dfamily.chessDemo.models.BoardCase;
import com.dfamily.chessDemo.models.dtos.BoardCaseDto;
import com.dfamily.chessDemo.models.mappers.Factory.PieceMapperFactory;
import com.dfamily.chessDemo.models.mappers.Factory.PlayerMapperFactory;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author johns
 */
@Mapper(componentModel = "caseMp", uses={PieceMapperFactory.class, PlayerMapperFactory.class})
public interface BoardCaseMapper {
    BoardCaseDto ToDto(BoardCase source);
    BoardCase ToEntity(BoardCaseDto destination);
    List<BoardCaseDto> ToDto(List<BoardCase> source);
    List<BoardCase> ToEntity(List<BoardCaseDto> destination);
    
}
