public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    public boolean isEqual(Contact contact) {
        if (this.getName() == contact.getName() && this.getPhoneNumber() == contact.getPhoneNumber()) { return true; }
        return false;
    }
}
