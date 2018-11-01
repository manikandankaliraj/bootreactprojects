package com.mklab.contacts.dto;

public class ContactNumber {

    private String number;

    private NumberTypes type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public NumberTypes getType() {
        return type;
    }

    public void setType(NumberTypes type) {
        this.type = type;
    }
}
