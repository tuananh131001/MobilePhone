package com.company;

public class Contact {
    private String ContactName;
    private String ContactPhoneNum;

    public Contact(String contactName, String contactPhoneNum) {
        ContactName = contactName;
        ContactPhoneNum = contactPhoneNum;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactPhoneNum() {
        return ContactPhoneNum;
    }

    public void setContactPhoneNum(String contactPhoneNum) {
        ContactPhoneNum = contactPhoneNum;
    }



}
