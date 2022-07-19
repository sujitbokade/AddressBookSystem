package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBook {
    Scanner sc=new Scanner(System.in);
    Contact contact=new Contact();

    public void addContact(){
        System.out.println("Enter First Name:");
        contact.setFirstName(sc.next());
        System.out.println("Enter Last Name:");
        contact.setLastName(sc.next());
        System.out.println("Enter Address:");
        contact.setAddress(sc.next());
        System.out.println("Enter City:");
        contact.setCity(sc.next());
        System.out.println("Enter State:");
        contact.setState(sc.next());
        System.out.println("Enter Mobile Number:");
        contact.setMobileNumber(sc.nextLong());
        System.out.println("Enter Zipcode:");
        contact.setZip(sc.nextInt());
        System.out.println("Enter Email Address:");
        contact.setEmail(sc.next());
    }
    Contact showInfo(){
        return contact;
    }
}
