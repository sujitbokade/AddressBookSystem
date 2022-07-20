package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressbook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.println("Enter 1 to Add Contact");
            System.out.println("Enter 2 to Edit Contact");
            System.out.println("Enter 3 to Delete");
            System.out.println("Enter 4 to Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addressbook.addContact();
                    break;
                case 2:
                    addressbook.editContact();
                    break;
                case 3:
                    addressbook.showInfo();
                    break;
                case 4:
                    addressbook.deleteContact();
                    break;
                case 5:
                    exit = false;
                default:
                    break;
            }
        }while (exit);
    }
}