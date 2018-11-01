package com.mklab.contacts.rest;

import com.mklab.contacts.dto.Contact;
import com.mklab.contacts.dto.ContactNumber;
import com.mklab.contacts.dto.NumberTypes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestHandler {

    @RequestMapping("/getContact")
    public Contact getContact(@RequestParam(name="name") String name){
        Contact contact =  getDummyContact(name);
        return contact;
    }

    private  Contact getDummyContact(String name){

        Contact contact = new Contact();
        contact.setFirstName(name);
        contact.setLastName("world");
        ContactNumber num = new ContactNumber();
        num.setNumber("+910000001000");
        num.setType(NumberTypes.MOBILE);
        List<ContactNumber> numbers = new ArrayList<>();
        numbers.add(num);
        contact.setNumbers(numbers);
        return  contact;


    }

}
