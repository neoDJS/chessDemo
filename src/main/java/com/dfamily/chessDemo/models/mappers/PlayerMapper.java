/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers;

import com.dfamily.chessDemo.models.Player;
import com.dfamily.chessDemo.models.dtos.PlayerDto;
import com.dfamily.chessDemo.models.mappers.Factory.PieceMapperFactory;
import com.dfamily.chessDemo.models.mappers.Factory.PlayerMapperFactory;
import org.mapstruct.Mapper;

/**
 *
 * @author johns
 */
@Mapper(componentModel = "playerMp", uses={PieceMapperFactory.class, PlayerMapperFactory.class})
public interface PlayerMapper {
    PlayerDto ToDto(Player source);
    Player ToEntity(PlayerDto destination);
    
}
