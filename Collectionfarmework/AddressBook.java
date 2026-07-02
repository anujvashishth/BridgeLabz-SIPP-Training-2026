import java.util.*;

class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int compareTo(Contact c) {
        return this.name.compareToIgnoreCase(c.name);
    }

    @Override
    public String toString() {
        return "Name : " + name +
               "\nPhone: " + phone +
               "\nEmail: " + email + "\n";
    }
}

public class AddressBook {

    ArrayList<Contact> list = new ArrayList<>();
    HashMap<String, Contact> map = new HashMap<>();
    HashSet<String> phoneSet = new HashSet<>();

    // Add Contact
    public void add(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number! Contact not added.");
            return;
        }

        Contact c = new Contact(name, phone, email);

        list.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    // Search Contact
    public void search(String name) {

        if (map.containsKey(name)) {
            System.out.println(map.get(name));
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    // Delete Contact
    public void delete(String name) {

        if (!map.containsKey(name)) {
            System.out.println("Contact Not Found.");
            return;
        }

        Contact c = map.get(name);

        list.remove(c);
        map.remove(name);
        phoneSet.remove(c.phone);

        System.out.println("Contact Deleted.");
    }

    // Display Sorted Contacts
    public void display() {

        Collections.sort(list);

        System.out.println("Contact List");

        for (Contact c : list) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        AddressBook obj = new AddressBook();

        obj.add("Anuj", "9876543210", "anuj@gmail.com");
        obj.add("Rohan", "9876543211", "rohan@gmail.com");
        obj.add("Priya", "9876543212", "priya@gmail.com");

        // Duplicate phone
        obj.add("Amit", "9876543210", "amit@gmail.com");

        System.out.println("\nSearch:");
        obj.search("Rohan");

        System.out.println("\nDisplay Sorted:");
        obj.display();

        System.out.println("\nDelete:");
        obj.delete("Rohan");

        System.out.println("\nAfter Delete:");
        obj.display();
    }
}