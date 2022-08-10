package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        addressBook.addNewAddressBook();

        boolean exit = true;
        do {
            System.out.println(""+AddressBook.addressBookList.keySet());
            System.out.println("current AddressBook Name is: "+addressBook.currentAddressBookName);

            System.out.println("Enter 1 to Add Contact");
            System.out.println("Enter 2 to Edit Contact");
            System.out.println("Enter 3 to Show Info");
            System.out.println("Enter 4 to Delete");
            System.out.println("Enter 5 to Add New AddressBook");
            System.out.println("Enter 6 to Select AddressBook");
            System.out.println("Enter 7 to Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Contact contact=addressBook.createContact();
                    addressBook.addContact(contact);
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.showInfo(addressBook.currentAddressBook);
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    addressBook.addNewAddressBook();
                    break;
                case 6:
                    addressBook.selectAddressBook();
                    break;
                case 7:
                    addressBook.searchContact();
                    break;
                case 8:
                    exit = false;
                default:
                    break;
            }
        }while (exit);
    }
}