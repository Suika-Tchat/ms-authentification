package com.suikatchat.auth.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Blob;
import java.time.LocalDateTime;

public class GetUserDTO {
    private Integer id;
    private String pseudo;

//    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
//    private LocalDateTime createdAt;
//    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
//    private LocalDateTime updatedAt;

    private Blob photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }
}
