/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dfamily.chessDemo.models.mappers;

import com.dfamily.chessDemo.models.Player;
import com.dfamily.chessDemo.models.dtos.PlayerDto;
import org.mapstruct.Mapper;

/**
 *
 * @author johns
 */
@Mapper(componentModel = "playerMp")
public interface PlayerMapper {
    PlayerDto ToDto(Player source);
    Player ToEntity(PlayerDto destination);
    
}
