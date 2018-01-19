package com.wx.menu.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.sql.Timestamp;
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class TypeEntity {
    private String idType;
    private String idUser;
    private String type;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    private Timestamp createdData;

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getCreatedData() {
        return createdData;
    }

    public void setCreatedData(Timestamp createdData) {
        this.createdData = createdData;
    }
}
