package com.suikatchat.auth.model.mapper;

import com.suikatchat.auth.dao.document.User;
import com.suikatchat.auth.model.dto.PostUserLoginDTO;

public class PostUserLoginMapper {

    public static User DtoToDocument(PostUserLoginDTO dto) {
        User document = new User();
        document.setId(dto.getId());
        document.setPseudo(dto.getPseudo());
        document.setPasswordHash(dto.getPassword());

        return document;
    }
}
