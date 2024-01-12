package com.suikatchat.auth.model.mapper;

import com.suikatchat.auth.dao.document.User;
import com.suikatchat.auth.model.dto.GetUserDTO;

public class GetUserMapper {

    public static GetUserDTO documentToDto(User document) {
        GetUserDTO userDTO = new GetUserDTO();

        userDTO.setId(document.getId());
        userDTO.setPseudo(document.getPseudo());
        userDTO.setPhoto(document.getPhoto());

        return userDTO;
    }
}
