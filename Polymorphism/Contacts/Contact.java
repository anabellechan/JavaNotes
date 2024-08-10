package Contacts;

public class Contact{
    private String name;
    private PhoneNumber phoneNumber;
    private String emailAddress;

    //Constructor
    public Contact(String name, PhoneNumber phoneNumber, String emailAddress) {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
    }

    //Constructor for just name and phone
    public Contact(String name, PhoneNumber phoneNumber) {
        this.name=name;
        this.phoneNumber=phoneNumber;
        }
    //Constructor for just name 
    public Contact(String name, String emailAddress) {
        this.name=name;
        this.emailAddress=emailAddress;
        }
    



}