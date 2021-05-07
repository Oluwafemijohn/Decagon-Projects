package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    ContactsManager myContactsManager = new ContactsManager();

        Contact Juwon = new Contact();
        Juwon.name = "Juwon";
        Juwon.phoneNumber = "3295252091";
        myContactsManager.addContact(Juwon);


        Contact Segun = new Contact();
        Segun.name = "Segun";
        Segun.phoneNumber = "32432525424";
        myContactsManager.addContact(Segun);

        Contact Titi = new Contact();
        Titi.name = "Titi";
        Titi.phoneNumber = "080377878472";
        myContactsManager.addContact(Titi);

        Contact john = new Contact();
        john.name = "john";
        john.phoneNumber = "080377878472748";
        myContactsManager.addContact(john);

        var r =myContactsManager.searchContact("Titi");
        System.out.print(r);
    }
}
