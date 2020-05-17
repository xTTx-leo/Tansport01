package com.company;

import com.company.Transport.Aircraft;
import com.company.Transport.Transport;
import com.company.person.Person;

public class Main {
    public static void main(String[] args) {
        Aircraft aircraft=new Aircraft();
        Person person=new Person();
        person.driveTransport(aircraft);
    }
}
