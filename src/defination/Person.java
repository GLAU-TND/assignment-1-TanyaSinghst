package defination;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String anotherContactNumber;
    private String emailAddress;
    private Person next;

    public Person() {
        next = null;
    }

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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAnotherContactNumber() {
        return anotherContactNumber;
    }

    public void setAnotherContactNumber(String anotherContactNumber) {
        this.anotherContactNumber = anotherContactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", anotherContactNumber='" + anotherContactNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", next=" + next +
                '}';
    }
}
