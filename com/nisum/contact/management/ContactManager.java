package com.nisum.contact.management;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        contacts.add(newContact);
    }

    public void removeContact(String name) {
        Contact foundContact = searchContact(name);
        if (foundContact != null) {
            contacts.remove(foundContact);
            System.out.println("Contact removed: " + foundContact.getName());
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public void listAllContacts() {
        System.out.println("List of Contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        // Adding contacts
        contactManager.addContact("John Doe", "1234567890", "john.doe@example.com");
        contactManager.addContact("Jane Smith", "9876543210", "jane.smith@example.com");
        contactManager.addContact("Michael Johnson", "5555555555", "michael.johnson@example.com");
        contactManager.addContact("Emily Davis", "1112223333", "emily.davis@example.com");



        // Listing all contacts
        contactManager.listAllContacts();

        // Searching for a contact
        System.out.println("\nSearching for contact: John Doe");
        Contact foundContact = contactManager.searchContact("John Doe");
        if (foundContact != null) {
            System.out.println("Contact found: " + foundContact);
        } else {
            System.out.println("Contact not found.");
        }

        // Removing a contact
        System.out.println("\nRemoving contact: Jane Smith");
        contactManager.removeContact("Jane Smith");

        // Listing all contacts after removal
        contactManager.listAllContacts();
    }
}
