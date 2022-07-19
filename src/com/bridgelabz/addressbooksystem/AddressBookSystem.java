package com.bridgelabz.addressbooksystem;

public class AddressBookSystem {
    public static void main(String[] args) {
           System.out.println("Welcome to Address Book System Program!");

            AddressBook addressBook=new AddressBook();
            Contact contact=new Contact();

            addressBook.addContact();
            System.out.print(addressBook.showInfo());

             addressBook.editContact();
             System.out.print(addressBook.showInfo());

             addressBook.deleteContact();
             System.out.print(addressBook.showInfo());

        }
}
