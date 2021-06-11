package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void printContactList(){
        System.out.println("You have " + contactList.size() + "items in your cart");
        for (int i = 0 ; i < contactList.size(); i++)
            System.out.println((i + 1) + ". "+ contactList.get(i).getContactName() + " - " +
                    contactList.get(i).getContactPhoneNum());
    }
    public Contact InitContact(){
        System.out.println("Please enter the contact name: ");
        String contactName = scanner.nextLine();
        System.out.println("Please enter the contact number: ");
        String contactPhone = scanner.nextLine();
        Contact newContact = new Contact(contactName,contactPhone);
        return newContact;
    }
    public void StoreContact(){
        Contact contact = InitContact();
        contactList.add(contact);
    }

    public void ModifyContact(int position , Contact newContact){
        contactList.set(position,newContact);
        System.out.println("Contact " + (position + 1) + " has been modified" );
    }
    public void RemoveContact(int position){
        Contact theContact = contactList.get(position);
        contactList.remove(position);
    }
    public int FindContact(String contactName){
        for( int i=0; i<this.contactList.size(); ++i){
            Contact contact = this.contactList.get(i);
            if(contact.getContactName().equals(contactName));{
                return 1;
            }
        }
        return -1;
    }

}
