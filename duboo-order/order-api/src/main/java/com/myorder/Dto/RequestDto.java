package com.myorder.Dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class RequestDto implements Serializable {

    private String name;

    private String passwworld;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswworld() {
        return passwworld;
    }

    public void setPasswworld(String passwworld) {
        this.passwworld = passwworld;
    }

    @Override
    public String toString() {
        return "RequestDto{" +
                "name='" + name + '\'' +
                ", passwworld='" + passwworld + '\'' +
                '}';
    }
}
