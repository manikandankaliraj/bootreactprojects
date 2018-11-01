package com.mklab.contacts.dto;

import lombok.Data;

import java.util.List;

@Data
public class Contact {

    private String  firstName;

    private String lastName;

    private List<ContactNumber> numbers;


}
