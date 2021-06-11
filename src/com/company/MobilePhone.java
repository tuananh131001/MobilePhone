package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();
    public void StoreContact(Contact contact){
        contactList.add(contact);
    }
    public void ModifyContact(int position , Contact newContact){
        contactList.set(position,newContact);
        System.out.println("Contact " + (position + 1) + " has been modified" );
    }
    public void RemoveContact(){

    }
    public void QueryContact(){

    }

}
