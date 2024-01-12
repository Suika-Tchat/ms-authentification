package com.suikatchat.auth.dao.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.sql.Blob;
import java.time.LocalDateTime;

@Document("user")
public class User {

    @Id
    private Integer id;
    @Field(name = "pseudo")
    @Indexed(unique = true)
    private String pseudo;
    @Field(name = "email")
    @Indexed(unique = true)
    private String email;
    @Field(name = "phoneNumber")
    @Indexed(unique = true)
    private String phoneNumber;
    @Field(name = "passwordHash")
    private String passwordHash;
    @Field(name = "salt")
    private String salt;
    @Field(name = "CreationDate")
    private LocalDateTime createdAt;
    @Field(name = "updateDate")
    private LocalDateTime updatedAt;
    @Field(name = "isUserActive")
    private boolean isActive;
    @Field(name = "photo")
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }
}
