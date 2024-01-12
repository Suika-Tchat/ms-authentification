package com.suikatchat.auth.model.dto;

public class PostUserLoginDTO {

    private Integer id;
    private String pseudo;
    private String password;
//    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
//    private LocalDateTime createdAt;
//    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
//    private LocalDateTime updatedAt;
//    private boolean isActive;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
}
