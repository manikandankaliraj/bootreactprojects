package com.mklab.contacts.dto;

public enum NumberTypes {

    MOBILE(1,"mobile"),
    LANDLINE(2,"landLine");

    private int code;

    private String desc;


    NumberTypes(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    @Override
    public String toString() {
        return "NumberTypes{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
