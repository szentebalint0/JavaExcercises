import java.util.ArrayList;
import java.util.Iterator;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {

        for (Contact contact : myContacts) {
            if (contact.equals(newContact)) {
                return false;
            }
        }

        myContacts.add(newContact);
        return true;

    }

    public boolean updateContact(Contact oldContact,  Contact newContact) {
        for (int i = 0; i< myContacts.size(); i++) {

            if (myContacts.get(i).isEqual(oldContact)) {
                myContacts.set(i, newContact);
                return true;
            }

        }
        return false;
    }

    public boolean removeContact(Contact oldContact) {
        Iterator<Contact> iterator = myContacts.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().isEqual(oldContact)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    private int findContact(Contact newContact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).isEqual(newContact)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String newContact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName() == newContact) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName() == name) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
