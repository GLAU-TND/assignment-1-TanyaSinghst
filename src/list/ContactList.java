package list;

import personADT.ContactlistADT;

public class ContactList implements ContactlistADT {

    private Person head;
    private int contactListLength;

    public ContactList() {
        head = null;
        contactListLength = 0;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public void search(String name) {

    }

    @Override
    public void viewAllContacts() {

    }
}
