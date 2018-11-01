package com.mklab.contacts.dto;

import java.util.List;

public class Contact {

    private String  firstName;

    private String lastName;

    private List<ContactNumber> numbers;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<ContactNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<ContactNumber> numbers) {
        this.numbers = numbers;
    }
}
