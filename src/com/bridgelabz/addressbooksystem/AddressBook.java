package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {
    static HashMap<String,ArrayList> addressBookList=new HashMap<String, ArrayList>();
    static ArrayList <Contact> currentAddressBook;
    static String currentAddressBookName;
    static Scanner scanner=new Scanner(System.in);
    static HashMap<String, ArrayList<Contact>> cityContactList = new HashMap<>();
    static HashMap<String,  ArrayList<Contact>> stateContactList = new HashMap<>();



    Contact createContact(){
        System.out.println("Enter first name");
        String firstName=scanner.next();
        System.out.println("Enter last name");
        String lastName=scanner.next();
        System.out.println("Enter address");
        String address=scanner.next();
        System.out.println("Enter city");
        String city=scanner.next();
        System.out.println("Enter state");
        String state=scanner.next();
        System.out.println("Enter Mobile Number");
        long mobNumber=scanner.nextLong();
        System.out.println("Enter ZipCode");
        int zipCode=scanner.nextInt();
        System.out.println("Enter Email");
        String email=scanner.next();

        Contact person=new Contact(firstName,lastName,address,city,state,mobNumber,zipCode,email);
        System.out.println("created new contact");
        return person;
    }

    void addContact(Contact person){
        currentAddressBook.add(person);
        System.out.println("contact added to AddressBook "+currentAddressBookName);
        System.out.println(person);
    }
    void editContact(){
        System.out.println("enter name to edit contact");
        String name=scanner.next();
        for (Contact person : currentAddressBook){
            if (person.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("Enter first name");
                person.setFirstName(scanner.next());
                System.out.println("Enter last name");
                person.setLastName(scanner.next());
                System.out.println("Enter address");
                person.setAddress(scanner.next());
                System.out.println("Enter city");
                person.setCity(scanner.next());
                System.out.println("Enter state");
                person.setState(scanner.next());
                System.out.println("Enter phoneNumber");
                person.setMobileNumber(scanner.nextLong());
                System.out.println("Enter ZipCode");
                person.setZip(scanner.nextInt());
                System.out.println("Enter Email");
                person.setEmail(scanner.next());
                System.out.println("contact updated successfully.");
                System.out.println(person);
                break;
            }
        }
    }

    void deleteContact(){
        boolean isContactFound=false;
        System.out.println("enter name to delete contact");
        String name=scanner.next();
        for (Contact contact : currentAddressBook){
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("contact found:");
                isContactFound=true;
                System.out.println(contact);
                System.out.println("confirm to delete (y/n)");
                if (scanner.next().equalsIgnoreCase("y")) {
                    currentAddressBook.remove(contact);
                    System.out.println("contact deleted Successfully!");
                }
                break;
            }
        }
        if (isContactFound == false) {
            System.out.println("Contact Not Found");
        }
    }
    void addNewAddressBook(){
        System.out.println("Enter name for AddressBook");
        String AddressBookName=scanner.next();
        ArrayList <Contact> AddressBook=new ArrayList();
        addressBookList.put(AddressBookName,AddressBook);
        System.out.println("new AddressBook created");
        currentAddressBook=addressBookList.get(AddressBookName);
        currentAddressBookName=AddressBookName;
    }
    void selectAddressBook(){
        System.out.println(addressBookList.keySet());
        System.out.println("enter name of address book");
        String addressBookName=scanner.next();

        for (String key :addressBookList.keySet()) {
            if (key.equalsIgnoreCase(addressBookName)){
                currentAddressBook=addressBookList.get(key);
                currentAddressBookName=key;
            }
        }
        System.out.println("current AddressBook is "+currentAddressBookName);

    }
    void viewContacts() {
        System.out.println("-----\n1.View by City \n2.View by State");
        switch (scanner.nextInt()) {
            case 1:
                viewContactByCity();
                break;
            case 2:
                viewContactByState();
                break;
            default:
                viewContacts();
                break;
        }
    }

    void viewContactByCity() {
        System.out.println("Enter City:");
        String city = scanner.next();
        for (String key : cityContactList.keySet()) {
            if (key.equalsIgnoreCase(city)){
                System.out.println(cityContactList.get(city));
            }
        }
    }

    void viewContactByState() {
        System.out.println("Enter State:");
        String state = scanner.next();
        for (String key : stateContactList.keySet()) {
            if (key.equalsIgnoreCase(state)){
                System.out.println(stateContactList.get(state));
            }
        }
    }

    boolean checkDuplicateContact(Contact newPerson) {
        return currentAddressBook.stream().anyMatch((person) -> person.getFirstName().equalsIgnoreCase(newPerson.getFirstName()));
    }
    void searchContact() {
        System.out.println("1. Search by City \n2.Search by State");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter city :");
                searchByCity(scanner.next());
                break;
            case 2:
                System.out.println("Enter State :");
                searchByState(scanner.next());
                break;
            default:
                searchContact();
        }
    }

    void searchByCity(String city) {
        System.out.println("Search Result: ");
        for (String addressBookName : addressBookList.keySet()) {
            for (Object p :addressBookList.get(addressBookName)){
                Contact person= (Contact) p;
                if (person.getCity().equalsIgnoreCase(city)) {
                    System.out.println(person);
                }
            }
        }
    }

    void searchByState(String state) {
        System.out.println("Search Result: ");
        for (String addressBookName : addressBookList.keySet()) {
            for (Object p :addressBookList.get(addressBookName)){
                Contact person= (Contact) p;
                if (person.getState().equalsIgnoreCase(state)) {
                    System.out.println(person);
                }
            }
        }
    }
    void showContactCount() {
        System.out.println("1.Count of City \n2.Count of State");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter city :");
                String city = scanner.next();
                System.out.println("Count: " + cityContactList.get(city).size());
                break;
            case 2:
                System.out.println("Enter State :");
                String state = scanner.next();
                System.out.println("Count: " + stateContactList.get(state).size());
                break;
            default:
                showContactCount();
                break;
        }
    }
    void sortContact(){
        List<Contact> list = currentAddressBook.stream().sorted().collect(Collectors.toList());
        list.stream().forEach(person -> System.out.println(person));

    }

}
