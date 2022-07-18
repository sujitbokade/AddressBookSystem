package com.bridgelabz.addressbooksystem;


class Contact
{
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String mobileNumber;
    String email;

    Contact(String firstName, String lastName,String address,String city,String state,String zip,String mobileNumer,String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobileNumber = mobileNumer;
        this.email  = email;
    }
    public void contacts()
    {
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Address: "+address);
        System.out.println("City: "+city);
        System.out.println("State: "+state);
        System.out.println("Zip Code: "+zip);
        System.out.println("Mobile Number: "+mobileNumber);
        System.out.println("Email Id: "+email);
    }
}
public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Program!");
        Contact cont=new Contact("Sujit","Bokade","Shinde Plot","Barshi","Maharashtra","413411","9130754248","sujitbokade2014@gmail.com");
        cont.contacts();
    }
}
