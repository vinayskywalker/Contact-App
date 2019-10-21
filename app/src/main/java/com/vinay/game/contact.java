package com.vinay.game;

public class contact {

    private String name;
    private String number;

    public contact() {
    }

    public contact(String name, String number) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
