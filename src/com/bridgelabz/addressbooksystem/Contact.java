package com.bridgelabz.addressbooksystem;

public class Contact {

        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private long mobileNumber;
        private int zip;
        private String email;

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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public long getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(long mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public int getZip() {
            return zip;
        }

        public void setZip(int zip) {
            this.zip = zip;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Contact(){

        }

        Contact(String firstName,String lastName,String address,String city,String state,long mobileNumber,int zip,String email){
            this.firstName=firstName;
            this.lastName=lastName;
            this.address=address;
            this.city=city;
            this.state=state;
            this.mobileNumber=mobileNumber;
            this.zip=zip;
            this.email=email;
        }

        public String toString() {
            return "Contact List{" +'\n'+
                    "firstName= " + firstName + '\n' +
                    "lastName= " + lastName + '\n' +
                    "address= " + address + '\n' +
                    "city= " + city + '\n' +
                    "state= " + state + '\n' +
                    "zip=" + zip +'\n'+
                    "phoneNumber=" + mobileNumber +'\n'+
                    "email= " + email + '\n' + "}";

        }
    }

