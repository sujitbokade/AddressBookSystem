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
    void editContact() {
        System.out.println("Enter first name to for edit information");
        String firstname = sc.next();
        if (firstname.equals((contact.getFirstName()))) {
            System.out.println("Edit Information");
            System.out.println("Enter First Name: ");
            contact.setFirstName(sc.next());

            System.out.println("Enter LastName: ");
            contact.setLastName(sc.next());

            System.out.println("Enter Address: ");
            contact.setAddress(sc.next());

            System.out.println("Enter City Name: ");
            contact.setCity(sc.next());

            System.out.println("Enter State: ");
            contact.setState(sc.next());

            System.out.println("Enter Mobilenumber: ");
            contact.setMobileNumber(sc.nextLong());

            System.out.println("Enter ZipCode: ");
            contact.setZip(sc.nextInt());

            System.out.println("Enter Email: ");
            contact.setEmail(sc.next());
        } else {
            System.out.println("Invalid Person!");
        }
    }
         void deleteContact(){
            System.out.println("Enter the first name of person to delete");
            String firstName = sc.next();

            if (firstName.equals(contact.getFirstName())){
                contact=null;
                System.out.println("Information deleted Successfully");
            }
            else{
                System.out.println("no contact found");
            }

        }

    Contact showInfo(){
        return contact;
    }
}
