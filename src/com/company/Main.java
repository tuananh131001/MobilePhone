package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while(!quit){
            printInstruction();
            System.out.println("Enter the choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    mobilePhone.printContactList();
                    ModifyContact();
                    break;
                case 4:
                    mobilePhone.printContactList();
                    RemoveContact();
                    break;
                case 5:
                    FindContact();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }
    public static void printInstruction(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options ");
        System.out.println("\t 1 - To print the list of contact ");
        System.out.println("\t 2 - Add contact ");
        System.out.println("\t 3 - Modify contact ");
        System.out.println("\t 4 - To remove contact from the list ");
        System.out.println("\t 5 - To search for an contact in the list ");
        System.out.println("\t 6 - To quit the application ");
    }
    public static void addContact(){
        mobilePhone.StoreContact();
    }
    public static void ModifyContact(){
        System.out.println("Enter the contact number: ");
        int contactNo = scanner.nextInt();
        scanner.nextLine();
        Contact newContact = mobilePhone.InitContact();
        mobilePhone.ModifyContact(contactNo - 1, newContact);

    }
    public static void RemoveContact(){
        System.out.println("Enter the item number: ");
        int contactNo = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.RemoveContact(contactNo-1);
    }
    public static void FindContact(){
        System.out.println("Phone num to search for ");
        String searchNum = scanner.nextLine();
        if (mobilePhone.FindContact(searchNum) != 0){
            System.out.println("Found "  + searchNum + " in contact list");
        } else {
            System.out.println(searchNum + " is not in the contact list");
        }
    }
}
